package com.eugene.javacore.patterns.Builder;

public class EnterpriseWebsiteBuilder extends WebSiteBuilder {
    @Override
    void buildname() {
        webSite.setName("Enterprise web site");
    }

    @Override
    void buildCms() {
webSite.setCms(Cms.ALIFRESSCO);
    }

    @Override
    void buildPrice() {
webSite.setPrice(10000);
    }
}
