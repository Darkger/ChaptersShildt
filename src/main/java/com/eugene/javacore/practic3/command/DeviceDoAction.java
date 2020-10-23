package com.eugene.javacore.practic3.command;

public class DeviceDoAction implements  Action
{
ApplicationProgram applicationProgram;

    public DeviceDoAction(ApplicationProgram applicationProgram) {
        this.applicationProgram = applicationProgram;
    }


    @Override
    public void doAction() {
        applicationProgram.completeTask();
    }
}
