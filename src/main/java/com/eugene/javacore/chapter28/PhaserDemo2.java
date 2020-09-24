package com.eugene.javacore.chapter28;

import java.util.concurrent.Phaser;
class MyThread6 implements Runnable
{
    Phaser phsr;
    String name;
    MyThread6(Phaser p, String n){
        phsr=p;
        name=n;
        phsr.register();
        new Thread(this).start();
    }
    public void run(){
        while(!phsr.isTerminated()){
            System.out.println("поток "+name+"начинае фазу "+phsr.getPhase());
            phsr.arriveAndDeregister();
        }
    }
}
class MyPhaser extends Phaser {
    int numPhases;
    MyPhaser(int parties, int phaserCount){
        super(parties);
        numPhases=phaserCount-1;
    }

    @Override
    protected boolean onAdvance(int p, int regParties) {
        if(p==numPhases|| regParties==0)
            return true;
        return false;
    }
}
public class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phaser = new MyPhaser(1,4);
        System.out.println("Запуск потоков\n");
        new MyThread6(phaser,"A");
        new MyThread6(phaser,"B");
        new MyThread6(phaser,"C");
        while(!phaser.isTerminated())
            phaser.arriveAndAwaitAdvance();
    }
}
