package com.eugene.javacore.chapter29;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

interface FunctionalInter <T>
{
      T func1 (T a, T b);
}
public class NewMyDemo {
    public String methodLymbda(String str1, String str2) {
        return str1 + str2;
    }

    public String meth(FunctionalInter<String> funcintr, String str1, String str2) {
        return funcintr.func1(str1, str2);
    }

    public static void main(String[] args) throws IOException {
        NewMyDemo newMyDemo = new NewMyDemo();
        int c;
        String str1 = newMyDemo.meth(newMyDemo::methodLymbda, "perviy ", "resultat\nvtoray stroca\ntrerya\nchetvornaya");
        System.out.println(str1);
        byte buffer[] = str1.getBytes();
        try (InputStream input = new FileInputStream("java.txt");
             OutputStream out = new FileOutputStream("C:\\javaFiles\\java.txt")) {

            for (int i = 0; i < buffer.length; i++) {
                out.write((char) buffer[i]);
            }

        } catch (FileNotFoundException e) {
            System.out.println("gg");
        }

        try (FileWriter writer = new FileWriter("C://avaFiles//java.txt")) {

        }catch (IOException e){}
        Path path = Paths.get("C://javaFiles//java.txt");
         Path file = Files.write(path,buffer);
         List<String> strList = Files.readAllLines(path);
        for (String str:strList
             ) {System.out.println(str);

        }
        System.out.println();
         List<String> strList2 = strList.stream().filter(a->a.startsWith("c")||a.startsWith("v")).map(a->a+" "+"Dobavlaem v noviy stream").collect(Collectors.toList());
        for(String s:strList2)
        {
            System.out.println(s);
        }
        URL url = new URL("https://yandex.ru");
        InetAddress in =  InetAddress.getByName("www.yandex.ru");
        System.out.println(in.getHostAddress());
        URLConnection urlco = url.openConnection();

    }
}
