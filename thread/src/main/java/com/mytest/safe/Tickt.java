package com.mytest.safe;

public class Tickt implements Runnable {

    private int ticktNum = 100;

    @Override
    public void run() {

        while(true) {
            if (ticktNum >0) {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String name = Thread.currentThread().getName();
                System.out.println("线程" + name + "售票" + ticktNum-- + " " + System.currentTimeMillis());
            }
        }
    }
}
