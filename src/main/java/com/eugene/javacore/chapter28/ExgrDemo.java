package com.eugene.javacore.chapter28;

import java.util.concurrent.Exchanger;

class MakeString implements Runnable
{
    Exchanger<String> ex;
    String str;
    MakeString(Exchanger <String> c){
        ex= c;
        str= new String();
    new Thread(this).start();
    }
    public void run(){
        char ch='A';
        for(int i =0;i<3;i++)
            for(int j=0;j<5;j++)
                str+=(char)ch++;
            try{
                str=ex.exchange(str);
            }catch (InterruptedException e){}
    }
}
class UseString implements  Runnable
{
    Exchanger<String> ex;
    String str;
    UseString (Exchanger<String> c){
        ex=c;
        new Thread(this).start();
    }
    public void run(){
        for(int i=0;i<3;i++){
            try{
                str=ex.exchange(new String());

            }catch (InterruptedException ex){}
        }
    }
}
public class ExgrDemo {
    public static void main(String[] args) {
        Exchanger<String> exgr = new Exchanger<>();
        new UseString((exgr));
        new MakeString(exgr);
    }
}
