package com.eugene.javacore.chapter13;

import java.io.*;

public class TinyEdit {
    public static void main (String args[] ) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str [] = new String [100];
        System.out.println("введите строки текста.");
        System.out.println("введите 'стоп' для завершения ");
        for ( int i =0; i<100;i++)
        {
            str[i] = br.readLine();
            if(str[i].equals("стоп")) break;
            System.out.println(str[i]);
        }
    }
}
