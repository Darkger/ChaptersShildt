package com.eugene.javacore.chapter28;

import java.util.concurrent.locks.ReentrantLock;

class LockThread implements Runnable {
    String name;
    ReentrantLock lock;

    LockThread(ReentrantLock l, String n) {
        lock = l;
        name = n;
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Запуск потока:" + name);
        try {
            System.out.println("Поток" + name + "ожидает блокировки счетчика");
            lock.lock();
            System.out.println("Поток" + name + " блокирует счетчик");
            Shared.count++;
            System.out.println(name+" "+Shared.count);
            Thread.sleep(1000);
        } catch (InterruptedException e) {System.out.println("Ошибка "+e);
        } finally {
            System.out.println("Поток " + name + "разблокирует счетчик");
            lock.unlock();
        }
    }
}

public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock rl = new ReentrantLock();
        new LockThread(rl, "A");
        new LockThread(rl, "B");

    }
}
