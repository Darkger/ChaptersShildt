package com.eugene.javacore.patterns.templateMethod;

public class NewsPage  extends WebsiteTemplate{


    @Override
    public void showPageContent() {
        System.out.println("News");
    }
}
