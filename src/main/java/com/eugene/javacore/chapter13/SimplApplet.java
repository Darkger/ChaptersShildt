package com.eugene.javacore.chapter13;

import java.applet.Applet;
import java.awt.*;
/*
<applet code="SimpleApplet" width=200 height=60>
</applet>
*/
public class SimplApplet extends Applet {
    public  void  paint (Graphics g)
    {
        g.drawString ("простейший аплет",20,20);

    }
}
