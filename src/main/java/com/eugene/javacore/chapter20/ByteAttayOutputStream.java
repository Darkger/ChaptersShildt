package com.eugene.javacore.chapter20;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteAttayOutputStream {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "эти данные должны быть выведены в массив";
        byte buf[] = s.getBytes();
        try {
            f.write(buf);

        }
        catch (IOException e)
        {
            System.out.println("ошибка записи в буфер");
            return;
        }
        System.out.println("Буффер ввиде символьной строки");
        System.out.println(f.toString());
        System.out.println("в массив");
        byte  b []= f.toByteArray();
        for (int i=0; i <b.length; i++)
        {
            System.out.println((char)b[i]);
        }
        try (FileOutputStream f2 = new FileOutputStream("test2"))
        {
            f.writeTo(f2);
        } catch (IOException e)
        {
            System.out.println("ошибка ввода - вывода " + e);
            return;
        }
        f.reset();
    }
}

