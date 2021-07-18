package com.catcher.redislock.lock;

import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Transaction;
import redis.clients.jedis.params.SetParams;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Service
public class RedisDistributionLock {
    private final JedisPool jedisPool = new JedisPool("127.0.0.1", 6379);

    /**
     * 获取锁
     * @param lockName 锁
     * @param times 超时时间
     * @return
     */
    public String acquireLock(String lockName, String id, long times){
        String result = null;
        Jedis connnect = jedisPool.getResource();
        long end = System.currentTimeMillis() + times;
        while (System.currentTimeMillis() < end){
            long value = connnect.setnx(lockName, id);
            if (1 == value){
                connnect.expire(lockName, 1);
                result = id;
            }
        }
        jedisPool.returnResource(connnect);
        return result;
    }

    /**
     * 释放分布式锁
     * @param lockName 锁
     * @param id 标志
     * @return 是否成功
     */
    public boolean releaseLocks(String lockName, String id){
        Boolean result = false;
        Jedis connect = jedisPool.getResource();
        while (true){
            connect.watch(lockName);
            if (lockName != null && id.equals(connect.get(lockName))){
                Transaction transaction = connect.multi();
                transaction.del(lockName);
                List results = transaction.exec();
                if (results == null){
                    continue;
                }
                result = true;
            }
            connect.unwatch();
            break;
        }
        jedisPool.returnResource(connect);
        return result;
    }

}
