package com.eugene.javacore.chapter20;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        int size;
        try (FileInputStream f = new FileInputStream("FileInputStreamDemo.java"))
        {
            System.out.println("Общее количество доступных байтов"+(size=f.available()));
            int n = size/40;
            System.out.println("Первые"+n+" байтов" + "прочитанных из файла по очереди методом read");
            for (int i=0;i<n;i++)
            {
                System.out.println((char) f.read());

            }
            System.out.println("\nВсе еще доступно: "+ f.available());
            System.out.println("Чтение следующих "+ n+ " байтов по  очереди методом read(b[])");
            byte b[] = new byte[n];
            if ( f.read(b)!=n)
                System.err.println("нельзя прочитать "+n+"байтов");
            System.out.println((new String(b,0,n)));
            System.out.println("\nВсе еще доступно: "+ (size=f.available()));
            System.out.println("пропустить половину байтов ");
            f.skip(size/2);
            System.out.println("\nВсе еще доступно: "+ f.available());
            System.out.println("чтение"+n/2 + "байтовб размещенных в конце массива");
            if (f.read(b,n/2,n/2) != n/2)
            {
                System.out.println("нельзя прочитать"+n/2+ " байтов. ");
            }
            System.out.println(new String (b,0,b.length));

        }
    }
}
