package com.eugene.javacore.practic3.bridge;

public class ShopBuisness extends Buisness {
    public ShopBuisness(Worker worker) {
        super(worker);
    }

    @Override
    public void createBuisnes() {
        System.out.println("Buisness  start...");
        worker.doWork();
    }
}
