package com.eugene.javacore.practic3.decorator;

public class Runner {
    public static void main(String[] args) {

        Manager manager = new DecoratorManager( new BadManager());
        manager.doWork();
    }
}
