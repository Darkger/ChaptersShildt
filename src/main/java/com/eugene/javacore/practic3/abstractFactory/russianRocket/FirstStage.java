package com.eugene.javacore.practic3.abstractFactory.russianRocket;

import com.eugene.javacore.practic3.abstractFactory.Stages;

public class FirstStage implements Stages {
    @Override
    public void creatStage() {
        System.out.println("Create first stage...");
    }
}
