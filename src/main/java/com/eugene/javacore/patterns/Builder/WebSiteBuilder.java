package com.eugene.javacore.patterns.Builder;

public abstract class WebSiteBuilder {
    WebSite webSite;
    void creatWebdite(){
        webSite = new WebSite();
    }
    abstract void buildname();
    abstract void buildCms();
    abstract void buildPrice();
    WebSite getWebSite()
    {
        return webSite;
    }
}
