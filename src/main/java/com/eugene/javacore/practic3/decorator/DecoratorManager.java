package com.eugene.javacore.practic3.decorator;

public class DecoratorManager implements  Manager{
    Manager manager;

    public DecoratorManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String doWork() {
return manager.doWork();
    }
}
