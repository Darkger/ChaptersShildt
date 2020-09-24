package com.eugene.javacore.chapter11;



import java.nio.file.FileSystemNotFoundException;

class Callme1{
    synchronized void call(String msg)
    {
        System.out.print("["+msg);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
        }
        System.out.print("]");
    }
}
class Caller1 implements  Runnable{
    String msg;
    Callme targer;
    Thread t;
    public Caller1(Callme targ, String s)
    {
        targer=targ;
        msg=s;
        t=new Thread(this);
        t.start();
    }
    public void run(){
        synchronized (targer)
        {

        }targer.call(msg);

    }
}
public class Synch1 {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target,"Добро пожаловать");
        Caller ob2 = new Caller(target,"в синхронизированный ");
        Caller ob3 = new Caller(target,"мир!");
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e ){}
    }
}