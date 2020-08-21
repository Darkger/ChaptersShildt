package com.eugene.javacore.chapter15;

interface MyFunc10<R, T> {
    R func(T n);
}

class MyClass1<T> {
    private T val;

    MyClass1(T v) {
        val = v;
    }

    T getVal() {
        return val;

    }
}

class MyClass2 {
    String str;

    MyClass2(String s) {
        str = s;
    }

    String getVal() {
        return str;
    }

}

public class ConstructorRefDemo3 {
    static <R, T> R myClassFactory(MyFunc10<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunc10<MyClass1<Double>, Double> myClassCons = MyClass1<Double>::new;
        MyClass1<Double> mc = myClassFactory(myClassCons, 100.1);
        mc.getVal();

    }
}
