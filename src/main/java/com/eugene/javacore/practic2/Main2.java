package com.eugene.javacore.practic2;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    Semaphore s1 = new Semaphore(1);
    Semaphore s2 = new Semaphore(0);
    Semaphore s3 = new Semaphore(0);

    public void first(ThreadFirst first) throws InterruptedException {
        s1.acquire();
        first.run();
        s2.release();

    }

    public void second(ThreadSecond second) throws InterruptedException {
        s2.acquire();
        second.run();
        s3.release();
    }

    public void third(ThreadThird third) throws InterruptedException {

        s3.acquire();
        third.run();
        s3.release();
    }
}

class ThreadFirst implements Runnable {
    public void run() {
        System.out.print("first");

    }
}

class ThreadSecond implements Runnable {
    public void run() {
        System.out.print("second");
    }
}

class ThreadThird implements Runnable {
    public void run() {
        System.out.print("third");

    }
}

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        foo.first(new ThreadFirst());
        foo.second(new ThreadSecond());
        foo.third(new ThreadThird());

    }

}
