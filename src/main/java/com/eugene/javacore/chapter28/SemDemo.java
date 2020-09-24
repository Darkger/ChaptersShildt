package com.eugene.javacore.chapter28;

import java.util.concurrent.Semaphore;

public class SemDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);

        new DecThread(sem,"A");
        new IncThread(sem,"B");
    }
}
class Shared{
    static  int count = 0;
}
class IncThread implements Runnable{
    String name;
    Semaphore sem;
    IncThread(Semaphore s,String n){
        sem=s;
        name=n;
        new Thread(this).start();
    }
    public void run (){
        System.out.println("Запуск потока "+name);
        try{
            System.out.println("Potok "+name + " ojidaet razresheniya");
            sem.acquire();
            System.out.println("potok"+name+"poluchaet razresheniya");
            for (int i=0;i<5;i++)
            {
                Shared.count++;
                System.out.println(name+":"+Shared.count);
                Thread.sleep(50);
            }
        }catch (InterruptedException e){}
        System.out.println("potok:"+name+"освобождает разрешение");
        sem.release();
    }
}
class DecThread implements  Runnable
{
    String name;
    Semaphore sem;
    DecThread(Semaphore s,String n) {
        sem = s;
        name = n;
        new Thread(this).start();
    }
        public void run() {
            try {
                System.out.println("Potok "+name + " ojidaet razresheniya");
                sem.acquire();
                System.out.println("potok"+name+"poluchaet razresheniya");
                for (int i=0;i<5;i++) {
                    Shared.count--;
                    
                    System.out.println(name+":"+Shared.count);
                    Thread.sleep(50);
                }
            }catch (InterruptedException exc){}
            System.out.println("Potok:"+name+"освобождает разрешение");
            sem.release();
        }

}
