package com.eugene.javacore.patterns.bridge;

public class StockExchange extends Program {
      protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developerProgram() {
        System.out.println("Stoc kExchange development in progress...");
        developer.writeCode();
    }
}
