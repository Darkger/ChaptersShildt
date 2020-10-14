package com.eugene.javacore.patterns.Builder;

public class Director {
    WebSiteBuilder builder;

    public void setBuilder(WebSiteBuilder builder) {
        this.builder = builder;
    }
    WebSite buildwebsite(){
        builder.creatWebdite();
        builder.buildname();
        builder.buildCms();
        builder.buildPrice();
        WebSite website = builder.webSite;
        return website;
    }
}
