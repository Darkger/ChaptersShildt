package com.eugene.javacore.chapter20;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderDemo {
    public static void main(String[] args) {
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        int length = tmp.length();
        char c[] = new char [length];
        tmp.getChars(0,length,c,0);
        int i ;
        try (CharArrayReader input1 = new CharArrayReader(c,0,5))
        {
            System.out.println("input1: ");
            while ((i= input1.read())!=-1)
                System.out.println((char)i);
        }catch (IOException e ){}
        try (CharArrayReader input1 = new CharArrayReader(c))
        {
            System.out.println("input1: ");
            while ((i= input1.read())!=-1)
                System.out.println((char)i);
        }catch (IOException e ){}
    }
}
