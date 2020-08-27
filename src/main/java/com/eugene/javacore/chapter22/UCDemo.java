package com.eugene.javacore.chapter22;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UCDemo {
    public static void main(String[] args) throws  Exception {
        int c ;
        URL hp = new URL ("http://www.internic.net");
        URLConnection hpCon = hp.openConnection();
        long d =hpCon.getDate();
        System.out.print("Тип содержимого "+hpCon.getContentType());
        d = hpCon.getExpiration();
        long len = hpCon.getContentLength();
        if ( len != 0){
            System.out.println("===Содержимое===");
        InputStream inputStream = hpCon.getInputStream();
        while ((c=inputStream.read())!=-1)
        {
            System.out.print((char) c);
        }
        inputStream.close();}
        else {System.out.println("Содержимое недоступною");}

    }
}
