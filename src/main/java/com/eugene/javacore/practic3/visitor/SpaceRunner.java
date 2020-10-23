package com.eugene.javacore.practic3.visitor;

public class SpaceRunner {
    public static void main(String[] args) {
        Project project = new Project();
        DesignBureau russianB= new RussianBureau();
        DesignBureau useB= new USEBureau();
project.toBeDone(russianB);
project.toBeDone(useB);
    }
}
