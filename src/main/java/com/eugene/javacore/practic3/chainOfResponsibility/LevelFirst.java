package com.eugene.javacore.practic3.chainOfResponsibility;

public class LevelFirst extends Level {


    public LevelFirst(int step) {
        super(step);
    }

    @Override
    public void write(String text) {
        System.out.println("access is allowed: "+text);
    }
}
