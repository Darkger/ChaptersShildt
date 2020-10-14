package com.eugene.javacore.patterns.factory;

public class PhpDeveloperFactory implements  DeveloperFactory{
    @Override
    public Developer creatDeveloper() {
        return  new PhpDeveloper();
    }
}
