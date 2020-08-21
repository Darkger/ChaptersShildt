package com.eugene.javacore.chapter15;

interface MyFunc9<T> {
    MyClass<T> func(T n);
}

class MyClass<T> {
    private T val;

    MyClass(T v) {
 val=v;
    }
    MyClass() {
        val=null;
    }
    T getVal (){
        return val;}
}

public class СonstructorRefDemo2 {
    public static void main(String[] args) {
        MyFunc9<Integer> myClassCons = MyClass<Integer>::new;
        MyClass<Integer> mc =myClassCons.func(100);
        mc.getVal();
    }
}
