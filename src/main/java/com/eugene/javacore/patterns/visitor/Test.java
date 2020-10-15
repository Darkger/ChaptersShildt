package com.eugene.javacore.patterns.visitor;

public class Test implements  ProjectElement {

    @Override
    public void beWritting(Developer developer) {
        developer.create(this);
    }
}
