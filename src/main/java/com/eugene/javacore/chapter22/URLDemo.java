package com.eugene.javacore.chapter22;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL hp  = new URL("http://www.HerbSchildt.com/Articles");
        System.out.println("протокол "+ hp.getProtocol());
        System.out.println("Порт "+ hp.getPort());
        System.out.println("Хос "+ hp.getHost());
        System.out.println("полная форма "+ hp.toExternalForm());

    }
}
