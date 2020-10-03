package com.eugene.javacore.practic2;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    Semaphore s1= new Semaphore(1);
    Semaphore s2= new Semaphore(0);
    Semaphore s3= new Semaphore(0);
    public void first() throws InterruptedException {
        s1.acquire();
        System.out.print("first");
        s2.release();
    }

    public void second() throws InterruptedException {
        s2.acquire();
        System.out.print("second");
        s3.release();
    }

    public void third() throws InterruptedException {
        s3.acquire();
        System.out.print("third");

    }
}

class ThreadFirst implements Runnable {

    Foo foo;

    ThreadFirst(Foo f) {
        foo=f;
        new Thread(this).start();
    }

    public void run() {

        try {
            foo.first();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class ThreadSecond implements Runnable {

    Foo foo;

    ThreadSecond(Foo f) {
        foo=f;
        new Thread(this).start();
    }

    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            foo.second();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class ThreadThird implements Runnable {

    Foo foo;

    ThreadThird(Foo f) {
        foo=f;
        new Thread(this).start();
    }

    public void run() {

        try {
            foo.third();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

public class Main2 {
    public static void main(String[] args) {
        Foo foo = new Foo();
        new ThreadThird(foo);

        new ThreadSecond(foo);
        new ThreadFirst(foo);
    }

}
