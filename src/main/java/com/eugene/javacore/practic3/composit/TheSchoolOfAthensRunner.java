package com.eugene.javacore.practic3.composit;

public class TheSchoolOfAthensRunner {
    public static void main(String[] args) {
        Philosophers aristotle = new Aristotle();
        Philosophers plato = new Plato();
        AncientPhilosophy ancientPhilosophy = new AncientPhilosophy();
        ancientPhilosophy.addPhilosophers(plato);
        ancientPhilosophy.addPhilosophers(aristotle);
        ancientPhilosophy.createScuolaDiAtene();
    }
}
