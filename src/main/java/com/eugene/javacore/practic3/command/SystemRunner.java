package com.eugene.javacore.practic3.command;

public class SystemRunner {
    public static void main(String[] args) {
        ApplicationProgram applicationProgram = new ApplicationProgram();
        Action action1 = new DevicePower(applicationProgram);
        action1.doAction();
        action1 = new DeviceDoAction(applicationProgram);
        action1.doAction();
        action1= new DeviceTurnedOff(applicationProgram);
        action1.doAction();
    }
}
