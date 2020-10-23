package com.eugene.javacore.practic3.state;

public class SpaceShip {
    ShipsCommand shipsCommand;
    public void setCommand(ShipsCommand shipsCommand1)
    {
        shipsCommand=shipsCommand1;
    }
    public void changeCommand(){
        if (shipsCommand instanceof MoveBackwards)
        {
            shipsCommand= new MoveForward();
        }
        else if( shipsCommand instanceof MoveForward)
        {
           shipsCommand= new MoveBackwards();
        }
    }
    public void  doIt(){
        shipsCommand.doCommand();
    }
}
