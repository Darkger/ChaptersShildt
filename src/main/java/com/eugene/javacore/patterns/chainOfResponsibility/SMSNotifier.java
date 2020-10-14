package com.eugene.javacore.patterns.chainOfResponsibility;

public class SMSNotifier extends  Notifaier {
    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
System.out.println("Notifyring SMS "+message);
    }
}
