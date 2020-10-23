package com.eugene.javacore.patterns.chainOfResponsibility;

public class BugTracker {
    public static void main(String[] args) {
        Notifaier reportNotifire = new SimpleReportNotifier(Priority.ROUTINE);
        Notifaier emailNotifire = new EmailNotifier(Priority.IMPORTANT);
        Notifaier smsNotifire = new SMSNotifier(Priority.ASAP);

        reportNotifire.setNextNotifier(emailNotifire);
        emailNotifire.setNextNotifier(smsNotifire);

        reportNotifire.notifyManager("okkk",Priority.ROUTINE);
        reportNotifire.notifyManager("ups",Priority.IMPORTANT);
        reportNotifire.notifyManager("oooo",Priority.ASAP);
    }


}
