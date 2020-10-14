package com.eugene.javacore.patterns.abstractFactory.banking;

import com.eugene.javacore.patterns.abstractFactory.ProjectManager;

public class BankingPm implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages projects...");
    }
}
