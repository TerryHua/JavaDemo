package com.mytest.safe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 通过同步锁 保证线程安全
 */
public class Tickt3 implements Runnable {


    private int ticktNum = 100;

    //定义锁对象：构造函数参数为线程是否公平获取锁true-公平；false-不公平，即由某个线程独占，默认是false
    Lock lock = new ReentrantLock(true);

    public void run() {
        while (true) {
            lock.lock();
            try {
                if (ticktNum>0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println("线程" + name + "售票" + ticktNum-- + " " + System.currentTimeMillis());
                }
            } finally {
                lock.unlock();
            }


        }
    }
}
