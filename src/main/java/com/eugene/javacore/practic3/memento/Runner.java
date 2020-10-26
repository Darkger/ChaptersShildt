package com.eugene.javacore.practic3.memento;

public class Runner {
    public static void main(String[] args) {
        Contributor contributor= new Contributor();

        contributor.setName("Mark");
        contributor.setSumm("10000$");
        System.out.println(contributor);
        Save save =  contributor.save();
        contributor.load(save );
        System.out.println(contributor);
    }
}
