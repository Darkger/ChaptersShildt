package com.eugene.javacore.chapter28;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
  class Qq
{
    static volatile int count=0;
}
class ThreadLock implements  Runnable{
    String name;
    ReentrantLock lock;
    ThreadLock(String n,ReentrantLock lo)
    {
        name=n;
        lock=lo;
        new Thread(this).start();
    }
    public void run()  {
        lock.lock();
        System.out.println("Potok "+ name+ " zablociroval count");
        Qq.count++;
        System.out.println("count = "+Qq.count);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Potok "+ name+ " razblociroval count");
        lock.unlock();

    }
}
public class MyLock {
    public static void main(String[] args) {
        ReentrantLock rl = new ReentrantLock();
        ExecutorService ex= Executors.newFixedThreadPool(1);
        ex.execute(new ThreadLock("A",rl));
        //ex.execute(new ThreadLock("B",rl));

    }
}
