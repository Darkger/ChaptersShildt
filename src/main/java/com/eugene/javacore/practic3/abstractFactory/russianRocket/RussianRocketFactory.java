package com.eugene.javacore.practic3.abstractFactory.russianRocket;

import com.eugene.javacore.practic3.abstractFactory.RocketFactory;
import com.eugene.javacore.practic3.abstractFactory.Stages;

public class RussianRocketFactory implements RocketFactory {
    @Override
    public Stages createThirdStage() {
        return new ThirdStage();
    }

    @Override
    public Stages createSecondStage() {
        return new SecondStage();
    }

    @Override
    public Stages createFirstStage() {
        return new FirstStage();
    }
}
