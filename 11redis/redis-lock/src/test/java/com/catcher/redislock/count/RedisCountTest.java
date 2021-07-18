package com.catcher.redislock.count;

import com.catcher.redislock.lock.RedisDistributionLock;
import com.catcher.redislock.lock.RedisLock;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class RedisCountTest {


    private ExecutorService pool = Executors.newFixedThreadPool(100);

    @Autowired
    public RedisCount count;
    @Autowired
    public RedisLock lock;
    @Autowired
    RedisDistributionLock lock1;

    @Test
    public void setIncr(){
        long stock = Long.valueOf(count.getValue("test"));
        System.out.println("当前库存："+stock);
        long result = count.setIncrBy("test", -1, 1);
        stock = Long.valueOf(count.getValue("test"));
        System.out.println("当前库存："+stock);
    }

    @Test
    public void InventoryReduction(){

        for(int i=0; i< 10; i++){
        long stock = Long.valueOf(count.getValue("test-1"));
            System.out.println("当前库存："+stock);
            String id = UUID.randomUUID().toString();
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    if(stock >= 1L){
                    lock.lock("test-1", id, 1);
                    System.out.println("获取锁："+id);
                    count.setIncrBy("test-1", -1, 1);
                    long value = Long.valueOf(count.getValue("test-1"));
                    System.out.println("当前库存："+value);
                    lock.releaseLock("test-1", id);
                    System.out.println("释放锁："+id);
                    }
                }
            });
        }
    }

    @Test
    public void InventoryReduction1(){

        for(int i=0; i< 100; i++){
            long stock = Long.valueOf(count.getValue("test-1"));
            System.out.println("当前库存："+stock);
            String id = UUID.randomUUID().toString();
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    if(stock >= 10L){
                        lock1.acquireLock("test-1", id, 1);
                        System.out.println("获取锁："+id);
                        count.setIncrBy("test-1", -1, 1);
                        long value = Long.valueOf(count.getValue("test-1"));
                        System.out.println("当前库存："+value);
                        lock1.releaseLocks("test-1", id);
                        System.out.println("释放锁："+id);
                    }
                }
            });
        }
    }

}