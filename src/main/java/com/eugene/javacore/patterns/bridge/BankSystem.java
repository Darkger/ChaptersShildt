package com.eugene.javacore.patterns.bridge;

public class BankSystem extends  Program {
    protected BankSystem(Developer developer){
        super(developer);}
    @Override
    public void developerProgram() {
        System.out.println("Bank System development in progress...");
        developer.writeCode();
    }
}
