package com.eugene.javacore.patterns.visitor;

public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWritting(Developer developer) {
for (ProjectElement element : projectElements)
{
    element.beWritting(developer);
}
    }
}
