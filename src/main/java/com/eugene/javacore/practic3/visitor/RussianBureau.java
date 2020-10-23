package com.eugene.javacore.practic3.visitor;

public class RussianBureau implements  DesignBureau {
    @Override
    public void create(Headunit headunit) {
        System.out.println("the Russian Bureau made the head module.. ");
    }

    @Override
    public void create(LaunchVehicle launchVehicle) {
        System.out.println("the Russian Bureau made the launch Vehicle module.. ");
    }
}
