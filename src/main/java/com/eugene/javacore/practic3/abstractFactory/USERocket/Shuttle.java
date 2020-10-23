package com.eugene.javacore.practic3.abstractFactory.USERocket;


import com.eugene.javacore.practic3.abstractFactory.Stages;


public class Shuttle implements Stages {


    @Override
    public void creatStage() {
        System.out.println("Create shuttle...");
    }
}
