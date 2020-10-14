package com.eugene.javacore.patterns.chainOfResponsibility;

public abstract class Notifaier {
    private  int priority;
    private Notifaier nextNotifier;

    public Notifaier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifaier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }
    public void notifyManager (String message, int level)
    {
        if (level>=priority){
            write(message);
        }
        if(nextNotifier!=null){
            nextNotifier.notifyManager(message,level);
        }
    }
    public  abstract void write(String message);
}
