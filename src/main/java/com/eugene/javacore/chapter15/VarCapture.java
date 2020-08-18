package com.eugene.javacore.chapter15;
interface  MyFunc {
    int func(int n);
}
public class VarCapture {
    public static void main(String[] args) {
        int num =10;
        MyFunc myLambda =(n)->{
            int v =num+n;
            //num++;  - нельзя, тк локальную переменную нельзя прииспользовании внутри лямбда выражения
            return v;
        };
        //num=0; - тоже нельзя, тк локальная переменная использованная в лямбде не должна изменятсья
    }
}
