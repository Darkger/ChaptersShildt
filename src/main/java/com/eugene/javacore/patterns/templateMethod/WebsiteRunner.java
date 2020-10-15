package com.eugene.javacore.patterns.templateMethod;

public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate websiteTemplate = new WelcomePage();
        WebsiteTemplate websiteTemplate1 = new NewsPage();
        websiteTemplate.showPage();
        System.out.println("\n============================\n");
        websiteTemplate1.showPage();


    }
}
