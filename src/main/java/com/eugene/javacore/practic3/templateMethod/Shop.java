package com.eugene.javacore.practic3.templateMethod;

public abstract class Shop {
    public  void showcase(){
        System.out.println("Showcase:");
        product();
        System.out.println();
    }
    public abstract  void product();
}
