package com.eugene.javacore.patterns.adapter;

public class AdapterJavaToDatabase extends  JavaApplication implements Database {
    @Override
    public void insert() {
        saveObjecdt();
    }

    @Override
    public void update() {
updateObject();
    }

    @Override
    public void select() {
loadObject();
    }

    @Override
    public void remove() {
deleteObject();
    }
}
