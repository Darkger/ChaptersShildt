package com.eugene.javacore.practic3.abstractFactory;

public interface RocketFactory {
    public Stages createThirdStage();
    public Stages createSecondStage();
    public Stages createFirstStage();
}
