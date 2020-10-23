package com.eugene.javacore.practic3.chainOfResponsibility;

public class LevelSecond extends Level {


    public LevelSecond(int step) {
        super(step);
    }

    @Override
    public void write(String text) {
        System.out.println("access is allowed: "+text);
    }
}
