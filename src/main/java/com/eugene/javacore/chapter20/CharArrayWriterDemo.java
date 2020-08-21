package com.eugene.javacore.chapter20;

import sun.awt.windows.WBufferStrategy;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter  f = new CharArrayWriter();
        String s = "Эти данные должны быть выведены в массив";
        char buf[] = new char [s.length()];
        s.getChars(0,s.length(),buf,0);
        try{
            f.write(buf);
        }catch (IOException e )
        {
            System.out.println("Ошибка записи в буфер");

        }
        System.out.println(f.toString());
        char c [] =f.toCharArray();
        for( int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
        try (FileWriter f2 = new FileWriter("test.txt"))
        {
            f.writeTo(f2);


        }catch (IOException e)
        {}
        System.out.println(("Установка в исходное состояние"));
        f.reset();
        for(int i = 0; i<3;i++)
        {
            f.write('c');
            System.out.println(f.toString());
        }
    }

}
