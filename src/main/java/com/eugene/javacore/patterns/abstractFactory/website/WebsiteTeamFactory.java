package com.eugene.javacore.patterns.abstractFactory.website;

import com.eugene.javacore.patterns.abstractFactory.Developer;
import com.eugene.javacore.patterns.abstractFactory.ProjectManager;
import com.eugene.javacore.patterns.abstractFactory.ProjectTeanFactory;
import com.eugene.javacore.patterns.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeanFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
