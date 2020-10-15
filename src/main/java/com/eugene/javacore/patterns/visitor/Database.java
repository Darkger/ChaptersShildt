package com.eugene.javacore.patterns.visitor;

public class Database implements ProjectElement {

    @Override
    public void beWritting(Developer developer) {
        developer.create(this);
    }
}
