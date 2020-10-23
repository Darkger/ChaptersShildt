package com.eugene.javacore.practic3.command;

public class DevicePower implements  Action {
    ApplicationProgram applicationProgram;

    public DevicePower(ApplicationProgram applicationProgram) {
        this.applicationProgram = applicationProgram;
    }

    @Override
    public void doAction() {
        applicationProgram.powerDevice();
    }
}
