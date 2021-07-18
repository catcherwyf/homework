package com.catcher.redislock.lock;

import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.params.SetParams;

import java.util.Collections;
import java.util.UUID;

@Service
public class RedisLock {

    private JedisPool jedisPool = new JedisPool();

    public boolean lock(String lockValue, String id, int seconds) {
        SetParams sets = new SetParams();
        sets.nx();
        sets.px(seconds);
        try(Jedis jedis = jedisPool.getResource()) {
            String result = jedis.set(lockValue, id, sets);
            if("OK".equals(result)){
                return true;
            }else{
                return false;
            }
        }
    }

    /**
     * 释放分布式锁
     * @param lockName 锁
     * @param id 请求标识
     * @return 是否释放成功
     */
    public boolean releaseLock(String lockName, String id) {
        final Long RELEASE_SUCCESS = 1L;

        Jedis connect = jedisPool.getResource();
        String script = "if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else return 0 end";
        Object result = connect.eval(script, Collections.singletonList(lockName), Collections.singletonList(id));

        if (RELEASE_SUCCESS.equals(result)) {
            return true;
        }
        return false;

    }
}
