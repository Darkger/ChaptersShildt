package com.eugene.javacore.practic3.facade;

public class SpaceFacade {
    Cosmonaut cosmonaut = new Cosmonaut();
    Rocket rocket = new Rocket();
    Start start = new Start();
    public void starting(){
        cosmonaut.preparCosmonaut();
        rocket.createRocket();
        start.doStart();
    }
}
