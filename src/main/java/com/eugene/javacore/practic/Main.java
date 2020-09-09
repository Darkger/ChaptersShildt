package com.eugene.javacore.practic;

import com.eugene.javacore.practic.Region.RegionView;

import java.io.IOException;

public class Main  {
    public static void main(String[] args) throws IOException {
       RegionView regionView = new RegionView();
       while(true)
       {
           regionView.routing();
       }
    }
}
