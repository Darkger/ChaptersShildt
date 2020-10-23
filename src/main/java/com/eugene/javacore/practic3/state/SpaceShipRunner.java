package com.eugene.javacore.practic3.state;

public class SpaceShipRunner {
    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip();
        spaceShip.setCommand( new MoveForward());
        spaceShip.doIt();
        spaceShip.changeCommand();
        spaceShip.doIt();
    }
}
