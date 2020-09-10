package com.eugene.javacore.practic.ESSENCES;

import java.util.List;

public class User {
    String id;
    String firstName;
    List<Post> posts;
    Region region;

    public User(String id, String firstName, List<Post> posts, Region region) {
        this.id = id;
        this.firstName = firstName;
        this.posts = posts;
        this.region = region;
    }
}
