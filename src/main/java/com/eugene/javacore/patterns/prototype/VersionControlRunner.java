package com.eugene.javacore.patterns.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1,"SuperProject","Source code = new SourceCode();");
        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
    }
}
