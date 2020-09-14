package com.eugene.javacore.practic;

import com.eugene.javacore.practic.ESSENCES.Post;
import com.eugene.javacore.practic.ESSENCES.Region;
import com.eugene.javacore.practic.ESSENCES.User;
import com.eugene.javacore.practic.REPOSITORYS.UserRepository;
import com.eugene.javacore.practic.VIEWS.PostView;
import com.eugene.javacore.practic.VIEWS.RegionView;
import com.eugene.javacore.practic.VIEWS.UserView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main  {
    public static void main(String[] args) throws IOException {
      RegionView regionView = new RegionView();
        PostView postView =  new PostView();
        UserView userView = new UserView();
       while(true)
       {
           userView.routing();
          // regionView.routing();
          // postView.routing();
       }

    }
}
