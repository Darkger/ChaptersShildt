package com.eugene.javacore.patterns.memento;

public class GitHubRepo {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
