package com.eugene.javacore.chapter28;

import java.util.concurrent.CountDownLatch;
class glass implements Runnable
{
    CountDownLatch latch;
    glass(CountDownLatch lch){
        latch=lch;
        new Thread(this).start();
    }
    public void run(){
        for(int i=5;i>0;i--)
        {
            System.out.println("i = "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            latch.countDown();
        }
    }
}
public class MyCountDownLatch1 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch cd= new CountDownLatch(5);
        new glass(cd);
        System.out.println("Вот тут главный поток вошел в блокировку");
        cd.await();

        System.out.println("А вот тут снялась блокировка ");
    }
}
