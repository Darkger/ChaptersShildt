package com.eugene.javacore.practic3.bridge;

public abstract class Buisness {
    Worker worker;

    public Buisness(Worker worker) {
        this.worker = worker;
    }
    public abstract void createBuisnes();
}
