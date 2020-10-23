package com.eugene.javacore.practic3.state;

public class MoveBackwards implements ShipsCommand {
    @Override
    public void doCommand() {
        System.out.println("Move Backwards... ");
    }
}
