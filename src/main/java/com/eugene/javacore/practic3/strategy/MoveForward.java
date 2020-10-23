package com.eugene.javacore.practic3.strategy;

public class MoveForward  implements ShipsCommand{
    @Override
    public void doCommand() {
        System.out.println("Move forward");
    }
}
