package com.eugene.javacore.practic3.adapter;

public class CommutatorRunner {
    public static void main(String[] args) {
        Mixer mixer = new SoftSwitchToMixer();
        mixer.inputSignal();
        mixer.outputSignal();
        mixer.bypassMod();
    }
}
