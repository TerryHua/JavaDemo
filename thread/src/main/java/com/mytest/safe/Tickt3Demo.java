package com.mytest.safe;



public class Tickt3Demo {
    public static void main(String[] args) {

        Tickt3 tickt = new Tickt3();
        Thread thread1 = new Thread(tickt, "窗口1");
        Thread thread2 = new Thread(tickt, "窗口2");
        Thread thread3 = new Thread(tickt, "窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
