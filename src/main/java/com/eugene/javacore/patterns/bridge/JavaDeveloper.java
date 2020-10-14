package com.eugene.javacore.patterns.bridge;

public class JavaDeveloper implements  Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer write java code...");
    }
}
