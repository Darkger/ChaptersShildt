package com.eugene.javacore.practic3.bridge;

public class UslessWroker implements Worker {
    @Override
    public void doWork() {
        System.out.println("Lie down and do nothing...");
    }
}
