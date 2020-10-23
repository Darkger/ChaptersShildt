package com.eugene.javacore.practic3.strategy;

public class SpaceShip {
    ShipsCommand shipsCommand;
    public void setShipsCommand(ShipsCommand shipsCommand1)
    {
        shipsCommand=shipsCommand1;

    }
    public void doMove()
    {
        shipsCommand.doCommand();
    }
}
