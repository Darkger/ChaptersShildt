package com.eugene.javacore.practic3.composit;

import java.util.ArrayList;
import java.util.List;

public class AncientPhilosophy {
    List<Philosophers> philosophersList = new ArrayList<>();
    public  void addPhilosophers(Philosophers philosophers){
        philosophersList.add(philosophers);
    }
    public  void removePhilosophers(Philosophers philosophers){
        philosophersList.remove(philosophers);
    }

    public void createScuolaDiAtene(){
        System.out.println("The School of Athens have:");
        for(Philosophers p:philosophersList){
            p.think();
        }
    }
}
