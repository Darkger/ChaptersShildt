package com.eugene.javacore.patterns.Builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new VisitCardWebsiteBuilder());
        WebSite website = director.buildwebsite();
    }
}
