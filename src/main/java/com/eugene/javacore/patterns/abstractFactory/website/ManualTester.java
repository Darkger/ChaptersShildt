package com.eugene.javacore.patterns.abstractFactory.website;

import com.eugene.javacore.patterns.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester test website...");
    }
}
