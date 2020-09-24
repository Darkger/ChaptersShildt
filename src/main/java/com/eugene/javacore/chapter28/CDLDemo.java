package com.eugene.javacore.chapter28;

import java.util.concurrent.CountDownLatch;

class MyThread implements Runnable {
    CountDownLatch latch;

    MyThread(CountDownLatch c) {
        latch = c;
        new Thread(this).start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            latch.countDown();
        }
    }
}

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cd = new CountDownLatch(5);
        MyThread myThread = new MyThread(cd);
        try {
            cd.await();
        } catch (InterruptedException e) {};

    }
}
