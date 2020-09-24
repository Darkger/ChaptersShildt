package com.eugene.javacore.chapter28;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class MyThread1 implements Runnable
{
    CyclicBarrier cbar;
    String name;
    MyThread1(CyclicBarrier c, String n)
    {
        cbar=c;
        name=n;
        new Thread(this).start();
    }
    public void run(){
        System.out.println(name);
        try{
            cbar.await();
        }catch (BrokenBarrierException exc){}
        catch (InterruptedException exc){}
    }
}
public class BarDemo{
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(5);
        new MyThread1(cb,"A");
        new MyThread1(cb,"B");
        new MyThread1(cb,"C");
    }
}
