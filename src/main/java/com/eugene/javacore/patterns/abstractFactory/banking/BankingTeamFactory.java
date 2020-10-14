package com.eugene.javacore.patterns.abstractFactory.banking;

import com.eugene.javacore.patterns.abstractFactory.Developer;
import com.eugene.javacore.patterns.abstractFactory.ProjectManager;
import com.eugene.javacore.patterns.abstractFactory.ProjectTeanFactory;
import com.eugene.javacore.patterns.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeanFactory {
    @Override
    public Developer getDeveloper() {
        return  new javaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPm();
    }
}
