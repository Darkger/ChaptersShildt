package com.eugene.javacore.patterns.abstractFactory;

import com.eugene.javacore.patterns.abstractFactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeanFactory projectTeanFactory = new BankingTeamFactory();
        Developer developer= projectTeanFactory.getDeveloper();
        Tester tester = projectTeanFactory.getTester();
        ProjectManager projectManager= projectTeanFactory.getProjectManager();
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
