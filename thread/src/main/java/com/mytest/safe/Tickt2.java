package com.mytest.safe;


/**
 * 同步方法实现线程安全
 */
public class Tickt2 implements Runnable {

    private int ticktNum = 100;

    @Override
    public void run() {
        while (true) {
            saleTick();
        }
    }

    private synchronized void saleTick() {
        if (ticktNum >0) {
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
