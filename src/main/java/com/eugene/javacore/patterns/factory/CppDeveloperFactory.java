package com.eugene.javacore.patterns.factory;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer creatDeveloper() {
        return new CppDeveloper();
    }
}
