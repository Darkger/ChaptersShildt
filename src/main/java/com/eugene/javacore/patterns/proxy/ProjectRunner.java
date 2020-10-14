package com.eugene.javacore.patterns.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("http://www.github.com");
        project.run();
    }
}
