package com.catcher.redislock.lock;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class RedisLockTest {

    @Autowired
    public RedisLock lock;

    @Test
    public void acquireLock(){
        String id = UUID.randomUUID().toString();
        boolean b = lock.lock("lock", id, 1);

        boolean c = lock.lock("lock", id, 1);
        System.out.println(b);
    }

    @Test
    public void releaseLock(){
        boolean b = lock.releaseLock("1", "");
        System.out.println(b);
    }
}