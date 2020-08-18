package com.eugene.javacore.chapter13;

import java.io.*;

public class ShowFile3 {
    public static void main (String args[]) throws IOException
    {
        int i;

        if (args.length !=1)
        {
            System.out.println("Использовать: ShowFile имя_файла");
            return;
        }
        try(FileInputStream fin = new FileInputStream(args[0])){

            do
            {
                i=fin.read();
                if(i!=-1)
                {
                    System.out.println((char) i);
                }
            } while (i!=-1);
        }catch(FileNotFoundException e)
        {
            System.out.println("Файл не найден");
        }
        catch(IOException e)
        {
            System.out.println("Ошибка ввода вывода");
        }

    }
}
