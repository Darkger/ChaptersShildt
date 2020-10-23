package com.eugene.javacore.practic3.factory;

public class OfficeManagerFactory implements ManagerFactory {
    @Override
    public Manager creatManager() {
        return new OfficeManager();
    }
}
