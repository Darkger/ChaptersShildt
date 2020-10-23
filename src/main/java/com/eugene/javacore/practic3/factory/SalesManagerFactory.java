package com.eugene.javacore.practic3.factory;

public class SalesManagerFactory  implements ManagerFactory{
    @Override
    public Manager creatManager() {
        return new SalesManager();
    }
}
