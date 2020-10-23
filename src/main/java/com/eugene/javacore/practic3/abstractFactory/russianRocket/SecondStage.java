package com.eugene.javacore.practic3.abstractFactory.russianRocket;

import com.eugene.javacore.practic3.abstractFactory.Stages;

public class SecondStage implements Stages {
    @Override
    public void creatStage() {
        System.out.println("Create second stage...");
    }
}
