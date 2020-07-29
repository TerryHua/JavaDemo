package com.mytest;

public class MyThread extends Thread{

    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println(Thread.currentThread().getName() + " ˙执行时间：" + System.currentTimeMillis() + "执行次数是：" + i );
        }
    }
}
