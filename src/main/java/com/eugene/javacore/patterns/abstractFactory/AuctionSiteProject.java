package com.eugene.javacore.patterns.abstractFactory;

import com.eugene.javacore.patterns.abstractFactory.website.WebsiteTeamFactory;

public class AuctionSiteProject{
    public static void main(String[] args) {
        ProjectTeanFactory projectTeanFactory = new WebsiteTeamFactory();
        Developer developer= projectTeanFactory.getDeveloper();
        Tester tester = projectTeanFactory.getTester();
        ProjectManager projectManager = projectTeanFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }

}
