package com.eugene.javacore.practic.model;

import java.util.Date;

public class Post {
    private String id;
    private String content;
    private Date create ;
    private Date update ;

    public Post() {
    }

    public Post(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
