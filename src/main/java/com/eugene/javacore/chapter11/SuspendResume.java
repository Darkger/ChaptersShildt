package com.eugene.javacore.chapter11;
class NewThread5 implements  Runnable{
    String name;
    Thread t;
    boolean suspendFlag;
    NewThread5(String threadName)
    {
        name =threadName;
        t=new Thread(this,name);
        System.out.println("Новый поток: "+t);
        suspendFlag = false;
        t.start();
    }
    public void run(){
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        }catch (InterruptedException e){}}
        synchronized void mysuspend(){
        suspendFlag=true;}
    synchronized void myresume(){
        suspendFlag=false;notify();}



}
public class SuspendResume {
    public static void main(String[] args) {
        NewThread5 ob1 = new NewThread5("Один");
        NewThread5 ob2 = new NewThread5("Два");
        try{
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Приостановка потока Один");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Возабновление потока Один");
            ob2.mysuspend();
            System.out.println("Приостановка потока Два");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Возабновление потока  Два");
        }catch (InterruptedException e){}

    }
}
