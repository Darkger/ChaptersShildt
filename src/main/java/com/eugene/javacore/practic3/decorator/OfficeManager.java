package com.eugene.javacore.practic3.decorator;

public class OfficeManager extends  DecoratorManager {
    public OfficeManager(Manager manager) {
        super(manager);
    }
public String goodWork(){
        return " good worker";
}
    @Override
    public String doWork() {
        return super.doWork()+goodWork();
    }
}
