package com.mytest;

/**
 * 自定义类，实现Runnable
 */
public class MyRunnable implements Runnable{

    public void run() {

        for (int i=0; i<10; i++) {
            System.out.println(Thread.currentThread().getName() + " ˙执行时间：" + System.currentTimeMillis() + "执行次数是：" + i );
        }
    }
}
