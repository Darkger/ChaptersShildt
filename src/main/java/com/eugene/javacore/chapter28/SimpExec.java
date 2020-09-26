package com.eugene.javacore.chapter28;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread7 implements Runnable
{
    String name;
    CountDownLatch latch;
    MyThread7(CountDownLatch c,String n){
        name=n;
        latch=c;
        new Thread(this).start();
    }
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(name);
        }
        latch.countDown();
    }
}
public class SimpExec {

    public static void main(String[] args) {
        CountDownLatch cd1 = new CountDownLatch(5);
        CountDownLatch cd2 = new CountDownLatch(5);
        CountDownLatch cd3 = new CountDownLatch(5);
        CountDownLatch cd4 = new CountDownLatch(5);
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(new MyThread7(cd1,"A"));
        es.execute(new MyThread7(cd1,"b"));
        es.execute(new MyThread7(cd1,"c"));
        es.execute(new MyThread7(cd1,"d"));
        try{
            cd1.await();
            cd2.await();
            cd3.await();
            cd4.await();
        }catch (InterruptedException e ){}
        es.shutdown();
    }
}
