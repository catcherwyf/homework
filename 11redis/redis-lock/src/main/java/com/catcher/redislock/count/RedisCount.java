package com.catcher.redislock.count;

import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.params.SetParams;

import java.util.UUID;

@Service
public class RedisCount {


    private final JedisPool jedisPool = new JedisPool("127.0.0.1", 6379);


    public long setIncrBy(String key, long increment, long times){
        long result = 0;
        Jedis connnect = jedisPool.getResource();
        long end = System.currentTimeMillis() + times;
        result = connnect.incrBy(key, increment);
        if (result <= 1 && times != 0){
            connnect.expire(key, times);
        }
        jedisPool.returnResource(connnect);
        return result;
    }

    public String getValue(String key){
        Jedis connect = jedisPool.getResource();
        String result = connect.get(key);
        return result;
    }
}
