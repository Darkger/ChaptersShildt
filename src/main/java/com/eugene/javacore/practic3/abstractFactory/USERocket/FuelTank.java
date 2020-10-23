package com.eugene.javacore.practic3.abstractFactory.USERocket;


import com.eugene.javacore.practic3.abstractFactory.Stages;

public class FuelTank implements Stages {

    @Override
    public void creatStage() {
        System.out.println("Create fuel tank...");
    }
}
