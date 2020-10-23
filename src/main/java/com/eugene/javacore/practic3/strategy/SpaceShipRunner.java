package com.eugene.javacore.practic3.strategy;

public class SpaceShipRunner {
    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip();
        spaceShip.setShipsCommand(new MoveBackwards());
        spaceShip.doMove();
        spaceShip.setShipsCommand(new MoveForward());
        spaceShip.doMove();
    }
}
