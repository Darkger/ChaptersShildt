package com.eugene.javacore.chapter22;

import java.net.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLDemo {
    public static void main(String[] args) throws Exception{
        URL hp = new URL ("http://www.google.com");
        HttpURLConnection hpCon =(HttpURLConnection)hp.openConnection();
        System.out.println("Метод запроса:"+hpCon.getRequestMethod());
        System.out.println("Код ответа :"+ hpCon.getResponseCode() );
        System.out.println("Ответное сообщение:"+hpCon.getResponseMessage());
        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("далее слежует заголовок:");
        for (String k:hdrField)
            System.out.println("ключ:"+k+"Значение:"+hdrMap.get(k));

    }
}
