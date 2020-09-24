package com.eugene.javacore.chapter11;
class NewThread4 implements Runnable{
    String name;
    Thread t;
    NewThread4(String nameThread)
    {
        name=nameThread;
        t=new Thread(this,name);
        t.start();
    }
    public void run()
    {

            try {
                for (int i = 5; i > 0; i--) {
                    System.out.println(name + ":" + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {

            }
        }
    }

public class DemoJoin {
    public static void main(String[] args) {
        NewThread4 ob1 = new NewThread4("Один");
        NewThread4 ob2 = new NewThread4("Два");
        NewThread4 ob3 = new NewThread4("Три");
        System.out.println("Поток Один запущен: "+ob1.t.isAlive());
        System.out.println("Поток Два запущен: "+ob2.t.isAlive());
        System.out.println("Поток Три запущен: "+ob3.t.isAlive());
        try{
            System.out.println("Ожидание завершения потоков.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){}
    }
}
