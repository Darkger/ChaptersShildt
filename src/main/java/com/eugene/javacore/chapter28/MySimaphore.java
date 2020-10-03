package com.eugene.javacore.chapter28;

import java.util.concurrent.Semaphore;

public class MySimaphore {
    public static void main(String[] args) {

        Prom p = new Prom();
        MyThreadGog v=  new MyThreadGog("A",  p);
        MyThreadGob v1= new MyThreadGob("B",  p);

    }

}

class Prom {
    static Semaphore semaphore = new Semaphore(1);
    static Semaphore semaphore2 = new Semaphore(0);
    static int prom = 0;
    static boolean control = false;
}

class MyThreadGog implements Runnable {

    Prom p;
    String name;

    MyThreadGog(String n,  Prom p) {
        name = n;

        this.p = p;
        new Thread(this, name).start();
    }

    public void run() {

        while(this.p.prom<10) {
            System.out.println("potok summ jden razredhenie");
            try {
                Prom.semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("potok summ poluchil razredhenie!");
            this.p.prom += 1;

            Prom.semaphore2.release();
        }


    }
}

class MyThreadGob implements Runnable {


    String name;
    Prom p;

    MyThreadGob(String n,  Prom p) {
        name = n;

        this.p = p;
        new Thread(this, name).start();
    }

    public void run() {

        while (this.p.prom<10){
            System.out.println("potok vivod jden razredhenie");
            try {
                Prom.semaphore2.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("potok vivod poluchil razredhenie!");
            System.out.println("prom= " + this.p.prom);
            Prom.semaphore.release();
        }



    }

}
