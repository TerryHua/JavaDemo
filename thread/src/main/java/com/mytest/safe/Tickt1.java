package com.mytest.safe;

/**
 * 使用同步代码块
 */
public class Tickt1 implements Runnable{

    private int ticktNum = 100;

    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticktNum>0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println("线程" + name + "售票" + ticktNum-- + " " + System.currentTimeMillis());
                }
            }
        }


    }
}
