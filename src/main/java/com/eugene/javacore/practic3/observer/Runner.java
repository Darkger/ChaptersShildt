package com.eugene.javacore.practic3.observer;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        YouTube youTube = new YouTube();


        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        user1.setName("Alex");
        user2.setName("Bobi");
        user3.setName("Dobi");
        youTube.addUser(user1);
        youTube.addUser(user2);
        youTube.addUser(user3);

        youTube.addVideoList("music video");
        youTube.addVideoList("protest in Belarus");




    }
}
