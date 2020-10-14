package com.eugene.javacore.patterns.factory;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer creatDeveloper() {
        return new JavaDeveloper();
    }
}
