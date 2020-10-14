package com.eugene.javacore.patterns.abstractFactory.website;

import com.eugene.javacore.patterns.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php devloper writes php code...");
    }
}
