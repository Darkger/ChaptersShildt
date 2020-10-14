package com.eugene.javacore.patterns.chainOfResponsibility;

public class EmailNotifier extends Notifaier {
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
System.out.println("Sending email:"+ message);
    }
}
