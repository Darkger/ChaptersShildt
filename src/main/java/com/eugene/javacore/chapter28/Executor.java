package com.eugene.javacore.chapter28;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class ThreadMyN implements  Runnable
{
    String name;
    ThreadMyN(String n){
        name=n;
        new Thread(this).start();
    }
    public void run(){
        System.out.println("potok "+name+" zarabotal");
    }
}
public class Executor  {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        ex.execute(new ThreadMyN("A"));
        ex.execute(new ThreadMyN("B"));

        ex.shutdown();
    }
}
