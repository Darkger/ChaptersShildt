package com.eugene.javacore.practic3.state;

public class MoveForward  implements ShipsCommand {
    @Override
    public void doCommand() {
        System.out.println("Move forward");
    }
}
