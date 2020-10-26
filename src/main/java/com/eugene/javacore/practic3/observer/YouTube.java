package com.eugene.javacore.practic3.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTube implements Observed {
    List<User> userList = new ArrayList<>();
    List<String> videoList= new ArrayList<>();

    public void addVideoList(String video ) {
         videoList.add(video);
        notifyUser();
    }

    @Override
    public void addUser(User user) {
        userList.add(user);

    }

    @Override
    public void removeUser(User user) {
userList.remove(user);

    }

    @Override
    public void notifyUser( ) {
   for(User user:userList){
       user.heandleUser(videoList);
   }
    }
}
