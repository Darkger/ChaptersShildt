package com.eugene.javacore.patterns.templateMethod;

import javax.xml.transform.Templates;

public class WelcomePage  extends  WebsiteTemplate {


    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }
}
