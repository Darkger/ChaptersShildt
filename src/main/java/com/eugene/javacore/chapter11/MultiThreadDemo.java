package com.eugene.javacore.chapter11;

class NewThread3 implements Runnable {
    String name;
    Thread t;

    NewThread3(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток:" + t);
        t.start();

    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {

        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread3("Один");
        new NewThread3("Два");
        new NewThread3("Три");
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток" + ":" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {

        }
    }
}
