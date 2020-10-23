package com.eugene.javacore.practic3.bridge;

public class FranchiseBuisness extends Buisness {
    public FranchiseBuisness(Worker worker) {
        super(worker);
    }

    @Override
    public void createBuisnes() {
        System.out.println("Franchise buisness start...");
        worker.doWork();
    }
}
