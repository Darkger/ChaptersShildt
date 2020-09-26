package com.eugene.javacore.chapter28;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Factorial implements  Callable<Integer>{
    int stop;
    Factorial(int v)
    {
        stop =v;
    }
    public Integer call(){
        int fact=1;
        for(int i=2;i<=stop;i++){
            fact*=i;
        }
        return fact;
    }
}
class Hypot implements  Callable<Double>
{
    double side1,side2;
    Hypot(double s1,double s2){
        side1=s1;
        side2=s2;
    }
    public Double call(){
        return Math.sqrt((side1*side2)+(side2*side2));
    }
}
class Sum implements Callable<Integer>
{
    int stop;
    Sum(int v){ stop=v;}
    public Integer call(){
        int sum =0;
        for(int i=1;i<= stop;i++){
            sum+=i;
        }
        return sum;
    }
}
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<Integer> f;
        Future<Double> f2;
        Future<Integer> f3;
        f= es.submit(new Sum(10));
        f2=es.submit(new Hypot(3,4));
        f3 =es.submit(new Factorial(5));
    }
}
