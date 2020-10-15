package com.eugene.javacore.patterns.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        Developer  juniorDeveloper = new JuniorDeveloper();
        Developer seniorDeveloper = new SeniorDeveloper();
        System.out.println("Junior in action");
        project.beWritting(juniorDeveloper);
        System.out.println("Semior in Action");
        project.beWritting(seniorDeveloper);
    }
}
