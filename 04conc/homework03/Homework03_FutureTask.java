package java0.conc0303;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 本周作业：（必做）思考有多少种方式，在main函数启动一个新线程或线程池，
 * 异步运行一个方法，拿到这个方法的返回值后，退出主线程？
 * 写出你的方法，越多越好，提交到github。
 *
 * 一个简单的代码参考：
 */
public class Homework03_FutureTask {
    
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        
        long start=System.currentTimeMillis();
        int result = 0;
        // 在这里创建一个线程或线程池，
        FutureTask<Integer> futureTask = new FutureTask<Integer>(new MyCallable());
        // 异步执行 下面方法
        Thread thread = new Thread(futureTask);
        thread.start();
    
        result = futureTask.get(); //这是得到的返回值
        
        // 确保  拿到result 并输出
        System.out.println("异步计算结果为："+result);
         
        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");
        
        // 然后退出main线程
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
