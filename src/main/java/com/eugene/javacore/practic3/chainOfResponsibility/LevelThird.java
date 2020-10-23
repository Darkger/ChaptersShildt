package com.eugene.javacore.practic3.chainOfResponsibility;

public class LevelThird extends Level {


    public LevelThird(int step) {
        super(step);
    }

    @Override
    public void write(String text) {
        System.out.println("access is allowed: "+text);
    }
}
