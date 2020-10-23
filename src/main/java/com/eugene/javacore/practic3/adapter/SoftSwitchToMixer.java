package com.eugene.javacore.practic3.adapter;

public class SoftSwitchToMixer extends SoftSwitch implements Mixer {

    @Override
    public void outputSignal() {
        outputSwitching();
    }

    @Override
    public void inputSignal() {
inputSwitching();
    }

    @Override
    public void bypassMod() {
bypass();
    }
}
