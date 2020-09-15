package com.eugene.javacore.practic;

import com.eugene.javacore.practic.view.PostView;
import com.eugene.javacore.practic.view.RegionView;
import com.eugene.javacore.practic.view.UserView;

import java.io.IOException;

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
