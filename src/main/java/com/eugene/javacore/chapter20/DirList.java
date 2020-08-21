package com.eugene.javacore.chapter20;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String dirname = "/java";
        File f1 = new File(dirname);
        if ( f1.isDirectory())
        {
            System.out.println("Каталог " +dirname);
            String s1[] = f1.list();
            for( int i =0;i<s1.length;i++)
            {
                File f = new File (dirname+"/"+s1[i]);
                        if ( f.isDirectory())
                        {
                            System.out.println(s1[i] + "каталог");

                        }
            else
                System.out.println(s1[i]+"файл");
            }
        } else System.out.println(dirname + "не является дирректорией");
    }
}
