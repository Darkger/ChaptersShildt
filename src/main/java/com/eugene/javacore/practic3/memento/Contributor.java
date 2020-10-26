package com.eugene.javacore.practic3.memento;

public class Contributor {
    String name;
    String summ;

    public void setName(String name) {
        this.name = name;
    }

    public void setSumm(String summ) {
        this.summ = summ;
    }

    public Save save() {
        return new Save(name, summ);

    }

    public void load(Save save) {
        name = save.getName();
        summ = save.getSumm();
    }

    @Override
    public String toString() {
        return "Contributor{" +
                "name='" + name + '\'' +
                ", summ='" + summ + '\'' +
                '}';
    }
}
