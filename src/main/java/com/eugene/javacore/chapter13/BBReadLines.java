package com.eugene.javacore.chapter13;

import java.io.*;


public class BBReadLines {
    public static void main (String  args[]) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("введите строки текста");
        System.out.println("введите 'стоп' для завершения.");
        do {
            str= reader.readLine();
            System.out.println(str);

        }while (!str.equals("стоп"));

    }
}
