package com.eugene.javacore.practic;

import com.eugene.javacore.practic.VIEWS.PostView;
import com.eugene.javacore.practic.VIEWS.RegionView;

import java.io.IOException;

public class Main  {
    public static void main(String[] args) throws IOException {
       RegionView regionView = new RegionView();
        PostView postView =  new PostView();
       while(true)
       {
          // regionView.routing();
           postView.routing();
       }
    }
}
