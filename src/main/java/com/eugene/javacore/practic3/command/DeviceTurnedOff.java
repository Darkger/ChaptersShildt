package com.eugene.javacore.practic3.command;

public class DeviceTurnedOff implements  Action {
    ApplicationProgram applicationProgram;

    public DeviceTurnedOff(ApplicationProgram applicationProgram) {
        this.applicationProgram = applicationProgram;
    }

    @Override
    public void doAction() {
        applicationProgram.offDevice();
    }
}
