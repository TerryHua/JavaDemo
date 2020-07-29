package com.mytest;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    public String call() throws Exception {
        for (int i =0; i<10; i++) {
            System.out.println(Thread.currentThread().getName() + " ˙执行时间：" + System.currentTimeMillis() + "执行次数是：" + i );
        }
        return "mycallable";
    }
}
