package com.eugene.javacore.practic3.abstractFactory.USERocket;

import com.eugene.javacore.practic3.abstractFactory.RocketFactory;
import com.eugene.javacore.practic3.abstractFactory.Stages;

public class UseRocketFactory implements RocketFactory {
    @Override
    public Stages createThirdStage() {
        return new FuelTank() ;
    }

    @Override
    public Stages createSecondStage() {
        return new Shuttle();
    }

    @Override
    public Stages createFirstStage() {
        return new LaunchVehicle();
    }
}
