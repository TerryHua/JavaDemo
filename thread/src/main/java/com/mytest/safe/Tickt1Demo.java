package com.mytest.safe;

public class Tickt1Demo {
    public static void main(String[] args) {

        Tickt1 tickt = new Tickt1();
        Thread thread1 = new Thread(tickt, "窗口1");
        Thread thread2 = new Thread(tickt, "窗口2");
        Thread thread3 = new Thread(tickt, "窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
