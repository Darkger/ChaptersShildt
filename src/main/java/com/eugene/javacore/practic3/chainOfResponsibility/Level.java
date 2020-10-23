package com.eugene.javacore.practic3.chainOfResponsibility;

public abstract class Level {
    Level nextStage;

  int step;

    public Level(int step) {
        this.step = step;
    }

    public void  setNextStage(Level next){
        nextStage=next;
    }
    public void registrationManager(String text,int level){

        if(level>=step )
        {
            write(text);

        }else{System.out.println("no access to the level "+step+"...");}
        if(nextStage!=null){
            nextStage.registrationManager(text,level);
        }

    }
    public abstract  void write(String text);

}
