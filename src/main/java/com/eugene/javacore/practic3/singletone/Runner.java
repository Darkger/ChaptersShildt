package com.eugene.javacore.practic3.singletone;

public class Runner {
    public static void main(String[] args) {
        Npc npc = new Npc();
       System.out.println(npc.plusCount());
        Npc npc2 = new Npc();
        System.out.println(npc2.plusCount());
    }


}
