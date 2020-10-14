package com.eugene.javacore.patterns.abstractFactory.banking;

import com.eugene.javacore.patterns.abstractFactory.Developer;

public class javaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer write Java code...");
    }
}
