package com.eugene.javacore.patterns.composit;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    public void creatProject() {
        System.out.println("Team creates project...\n");
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
