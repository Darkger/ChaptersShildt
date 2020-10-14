package com.eugene.javacore.patterns.chainOfResponsibility;

public class SimpleReportNotifier  extends  Notifaier{
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
System.out.println("Notifying using simpler report ..."+message);
    }
}
