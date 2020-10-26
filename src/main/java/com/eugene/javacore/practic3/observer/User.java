package com.eugene.javacore.practic3.observer;

import java.util.List;

public class User implements  Observer {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void heandleUser(List<String> video) {
        System.out.println(name+ ", new videos have appeared in your recommendations:"+video);

    }
}
