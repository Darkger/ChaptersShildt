package com.eugene.javacore.patterns.abstractFactory;

public interface ProjectTeanFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
