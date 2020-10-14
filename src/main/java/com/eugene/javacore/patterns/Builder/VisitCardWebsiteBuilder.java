package com.eugene.javacore.patterns.Builder;

public class VisitCardWebsiteBuilder extends  WebSiteBuilder {
    @Override
    void buildname() {
        webSite.setName("Visit card");
    }

    @Override
    void buildCms() {
webSite.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
webSite.setPrice(500);
    }
}
