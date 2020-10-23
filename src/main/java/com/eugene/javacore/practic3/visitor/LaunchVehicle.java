package com.eugene.javacore.practic3.visitor;

public class LaunchVehicle implements  ProjectItem {
    @Override
    public void toBeDone(DesignBureau designBureau) {
        designBureau.create(this);
    }
}
