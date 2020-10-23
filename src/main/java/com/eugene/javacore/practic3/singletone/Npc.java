package com.eugene.javacore.practic3.singletone;

public class Npc {
    public static  Npc npc;
  public  static  int count=0;
    public Npc() {
    }

   public static synchronized Npc getNpc(){
        if(npc==null){
            npc= new Npc();
        }
        return  npc;
    }

    @Override
    public String toString() {
        return "Npc = "+ npc;
    }
    public int plusCount()
    {
        count++;
        return count;
    }
}
