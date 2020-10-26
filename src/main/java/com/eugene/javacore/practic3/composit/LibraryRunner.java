package com.eugene.javacore.practic3.composit;

public class LibraryRunner {
    public static void main(String[] args) {
        Philosophers aristotle = new Russell();
        Philosophers plato = new FriedrichHegel();
        Library ancientPhilosophy = new Library();
        ancientPhilosophy.addPhilosophers(plato);
        ancientPhilosophy.addPhilosophers(aristotle);
        ancientPhilosophy.createScuolaDiAtene();
    }
}
