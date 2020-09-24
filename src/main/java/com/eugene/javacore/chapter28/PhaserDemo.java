package com.eugene.javacore.chapter28;

import java.util.concurrent.Phaser;
class MyThread3 implements Runnable
{
    Phaser phsr;
    String name;
    MyThread3(Phaser ps,String n)
    {
        phsr=ps;
        name=n;
        phsr.register();
        new Thread(this).start();
    }
    public void run (){
        System.out.println("Поток "+name+ " начинает первую фазу");
        phsr.arriveAndAwaitAdvance();
        try{
            Thread.sleep(10);
        }catch (InterruptedException e ){}
        System.out.println("Поток "+name+ "начинает вторую фазу");
        phsr.arriveAndAwaitAdvance();
        try{
            Thread.sleep(10);
        }catch (InterruptedException e ){}
        System.out.println("Поток "+name+ "начинает третью фазу");
        phsr.arriveAndDeregister();
    }
}
public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phsr = new Phaser(1);
        int curPhase;
        System.out.println("запуск потоков");
        new MyThread3(phsr,"A");
        new MyThread3(phsr,"B");
        new MyThread3(phsr,"C");
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза "+curPhase+"завершена");
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза "+curPhase+"завершена");
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза "+curPhase+"завершена");
        curPhase = phsr.getPhase();
        phsr.arriveAndDeregister();

    }
}
