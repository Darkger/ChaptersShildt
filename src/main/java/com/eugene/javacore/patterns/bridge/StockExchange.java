package com.eugene.javacore.patterns.bridge;

public class StockExchange extends Program {
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developerProgram() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }
}
