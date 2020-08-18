package com.eugene.javacore.chapter15;
interface  MynNumber {
    double getValue();
}
public class LambdaDemo {
    public static void main (String args[])
    {
        MynNumber muNum;
        muNum=()->123.45;
        System.out.println("Фиксированное значение:"+ muNum.getValue());
        muNum=()->Math.random()*100;
        System.out.println("случайное знаечение "+ muNum.getValue());
        System.out.println("Еще одно случайное знаечение "+ muNum.getValue());
      //  muNum = ()->"123.03"; - ошибка, тк тип не соотвествует типу указанному в интерфейсе
    }
}
