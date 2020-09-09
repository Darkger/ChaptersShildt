package com.eugene.javacore.practic.Region;

public class Region {
    private String id;
    private String charRegName;

    public Region() {

    }

    public Region(String id, String charRegName) {
        this.id = id;
        this.charRegName = charRegName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCharRegName() {
        return charRegName;
    }

    public void setCharRegName(String charRegName) {
        this.charRegName = charRegName;
    }
}
