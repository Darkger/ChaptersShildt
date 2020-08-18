package com.eugene.javacore.chapter13;

import java.io.*;

public class PrintWriteDemo {
    public static void main (String args []) throws IOException
    {
        PrintWriter pw = new PrintWriter(System.out, true );
        pw.println("это строка");
        int i =-7;
        pw.println(i);
        double d =4.5e-7;
        pw.println(d);

    }
}
