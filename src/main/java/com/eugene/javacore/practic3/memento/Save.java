package com.eugene.javacore.practic3.memento;

public class Save {
   final String name;
   final  String summ;

    public Save(String name, String summ) {
        this.name = name;
        this.summ = summ;
    }

    public String getName() {
        return name;
    }

    public String getSumm() {
        return summ;
    }

}
