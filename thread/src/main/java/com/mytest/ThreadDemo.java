package com.mytest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ThreadDemo {


    public static void main(String[] args) {
        for (int i = 0; i<10; i++) {
            System.out.println(Thread.currentThread().getName() + " ˙执行时间：" + System.currentTimeMillis() + "执行次数是：" + i );
        }
        //通过实现runnable接口创建线程
        Thread thread = new Thread(new MyRunnable());
        thread.start();

        //继承Thread创建线程
        MyThread myThread = new MyThread();
        myThread.start();

        //callable创建线程
        FutureTask<String> task  = new FutureTask<String>(new MyCallable());
        Thread thread1 = new Thread(task);
        thread1.start();

        //通过线程池创建线程
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new MyRunnable());

    }

}
