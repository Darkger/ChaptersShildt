package com.eugene.javacore.practic3.strategy;

public class MoveBackwards implements ShipsCommand {
    @Override
    public void doCommand() {
        System.out.println("Move Backwards... ");
    }
}
