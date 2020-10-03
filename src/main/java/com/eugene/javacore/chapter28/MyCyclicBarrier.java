package com.eugene.javacore.chapter28;

import com.eugene.javacore.practic.model.Post;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class ObjSumm
{
     static int a=0;
    static int b=0;
    static int c=0;
}
class PostSumm implements  Runnable
{
    ObjSumm objSumm;
    String name;

    PostSumm(String n,ObjSumm o)
    {
        name= n;
        objSumm=o;

    }
    public void run(){
   System.out.println("Summa ravna summ ="+objSumm.a+objSumm.b+objSumm.c);
    }
}
class Summ implements  Runnable
{   CyclicBarrier cb;
    ObjSumm objSumm;
    String name;
    Summ(String n,ObjSumm o,CyclicBarrier c){
        name=n;
        objSumm=o;
        cb=c;
        new Thread(this).start();
    }
    public void run(){
        System.out.println("Potok "+name+"nachal rabotu");
        if(name.equals("A")){
      for(int i=0;i<10;i++){
          objSumm.a=i;

      }System.out.println(name+"="+objSumm.a);}
        if(name=="B"){

            for(int i=0;i<10;i++) {
                objSumm.b = i;
            }System.out.println(name+"="+objSumm.b);}
        if(name=="C"){
            for(int i=0;i<10;i++){
                objSumm.c=i;}
            System.out.println(name+"="+objSumm.c);}

        try {
            System.out.println("Potok "+name+"jdet");
            cb.await();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

public class MyCyclicBarrier {
    public static void main(String[] args) {
        ObjSumm b= new ObjSumm();
        CyclicBarrier cb = new CyclicBarrier(3,new PostSumm("Summ",b));

        new Summ("A",b,cb);
        new Summ("B",b,cb);
        new Summ("C",b,cb);

    }
}
