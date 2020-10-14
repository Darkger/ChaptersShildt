package com.eugene.javacore.patterns.chainOfResponsibility;

public class BugTracker {
    public static void main(String[] args) {
        Notifaier reportNotifire = new EmailNotifier(Priority.ROUTINE);
        Notifaier emailNotifire = new EmailNotifier(Priority.IMPORTANT);
        Notifaier smsNotifire = new EmailNotifier(Priority.ASAP);

        reportNotifire.setNextNotifier(emailNotifire);
        emailNotifire.setNextNotifier(smsNotifire);

    }


}
