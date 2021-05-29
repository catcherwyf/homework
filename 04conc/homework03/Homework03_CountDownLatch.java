package java0.conc0303.homework03;

import java.util.concurrent.CountDownLatch;

/**
 * 本周作业：（必做）思考有多少种方式，在main函数启动一个新线程或线程池，
 * 异步运行一个方法，拿到这个方法的返回值后，退出主线程？
 * 写出你的方法，越多越好，提交到github。
 *
 * 一个简单的代码参考：
 */
public class Homework03_CountDownLatch {
    
    public static void main(String[] args) throws InterruptedException {
        
        long start=System.currentTimeMillis();
        BackResult back = new BackResult();
        // 在这里创建一个线程或线程池，使用countDownLatch控制并发
        CountDownLatch countDownLatch = new CountDownLatch(1);
        // 异步执行 下面方法
        int result = 0;
        //启动线程
        Thread thread = new Thread(new MyRunnable(back, countDownLatch));
        thread.start();

        // 确保  拿到result 并输出
        countDownLatch.await();
        result = back.getResult();

        System.out.println("异步计算结果为："+result);
        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");
        
        // 然后退出main线程
    }

    static class MyRunnable implements Runnable{
        private BackResult result;
        private CountDownLatch latch;
        public MyRunnable(BackResult result, CountDownLatch latch){
            this.result = result;
            this.latch = latch;
        }

        @Override
        public void run() {
            synchronized (this){
                result.setResult(sum());
                latch.countDown();
            }
        }
    }

    //内部类用来保存返回结果
    private static class BackResult {
        private int result;

        public BackResult(int result){
            this.result = result;
        }

        public BackResult() {

        }

        public void setResult(int result) {
            this.result = result;
        }

        public int getResult() {
            return result;
        }
    }


    private static int sum() {
        return fibo(36);
    }
    
    private static int fibo(int a) {
        if ( a < 2) 
            return 1;
        return fibo(a-1) + fibo(a-2);
    }
}
