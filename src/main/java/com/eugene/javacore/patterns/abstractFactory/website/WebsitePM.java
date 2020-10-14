package com.eugene.javacore.patterns.abstractFactory.website;

import com.eugene.javacore.patterns.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website Pm manage website...");
    }
}
