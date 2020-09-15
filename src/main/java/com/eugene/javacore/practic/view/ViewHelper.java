package com.eugene.javacore.practic.view;

import java.io.IOException;

public class ViewHelper {
   public void  mainHelper() throws IOException {
       UserView userView = new UserView();
       while (true) {
           userView.routing();

       }
   }

}
