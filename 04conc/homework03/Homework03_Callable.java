package java0.conc0303.homework03;

import java.util.concurrent.*;

/**
 * 本周作业：（必做）思考有多少种方式，在main函数启动一个新线程或线程池，
 * 异步运行一个方法，拿到这个方法的返回值后，退出主线程？
 * 写出你的方法，越多越好，提交到github。
 *
 * 一个简单的代码参考：
 */
public class Homework03_Callable {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        long start=System.currentTimeMillis();
        int result = 0;

        // 在这里创建一个线程或线程池
        //ExecutorService es = Executors.newFixedThreadPool(1);
        //ExecutorService es = Executors.newCachedThreadPool();
        //ExecutorService es = Executors.newScheduledThreadPool(1);
        ExecutorService es = Executors.newSingleThreadExecutor();
        MyCallable call = new MyCallable();
        // 异步执行 下面方法
        //启动线程
        Future<Integer> future = es.submit(call);
        // 确保  拿到result 并输出
        result = future.get();
        System.out.println("异步计算结果为："+result);
        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");
        
        // 然后退出main线程
        es.shutdown();
    }



    private static int sum() {
        return fibo(36);
    }
    
    private static int fibo(int a) {
        if ( a < 2) 
            return 1;
        return fibo(a-1) + fibo(a-2);
    }
    //实现Callable接口
    private static class MyCallable implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            return sum();
        }
    }
}
