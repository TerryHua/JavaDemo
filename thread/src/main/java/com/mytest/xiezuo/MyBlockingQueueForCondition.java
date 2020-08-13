package com.mytest.xiezuo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


/**
 * 用 Condition 实现简易版阻塞队列
 */
public class MyBlockingQueueForCondition {
    private Queue queue;

    private int max = 16;

    private ReentrantLock lock = new ReentrantLock();

    private Condition notEmpty = lock.newCondition();

    private Condition notFull = lock.newCondition();


    public MyBlockingQueueForCondition(int size) {
        this.max = size;
        queue = new LinkedList();
    }


    public void put(Object v) throws InterruptedException {
        lock.lock();
        try {
            while(max == queue.size()) {
                notFull.await();
            }
            queue.add(v);
            notEmpty.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public  Object take(Object o) throws InterruptedException{
        lock.lock();
        try {
            while (queue.size() == 0 ) {
                notEmpty.await();
            }
            Object item = queue.remove();
            notFull.signalAll();
            return item;
        } finally {
            lock.unlock();
        }
    }
}