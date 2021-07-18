package com.catcher.redislock.lock;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootTest
class RedisDistributionLockTest {

    @Autowired
    RedisDistributionLock lock;

    @Test
    public void acquireLock(){

        String id = UUID.randomUUID().toString();
        String result = lock.acquireLock("1", id,1);
        System.out.println(result);
    }

    @Test
    public void releaseLock(){
        boolean b = lock.releaseLocks("1", "");
        System.out.println(b);
    }
}