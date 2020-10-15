package com.eugene.javacore.patterns.visitor;

import com.eugene.javacore.patterns.strategy.Developer;

public class ProjectClass implements ProjectElement {


    @Override
    public void beWritting(com.eugene.javacore.patterns.visitor.Developer developer) {
         developer.create(this);
    }
}
