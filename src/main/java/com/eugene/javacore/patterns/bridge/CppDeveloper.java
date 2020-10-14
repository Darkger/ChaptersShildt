package com.eugene.javacore.patterns.bridge;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer write c++ code...");
    }
}
