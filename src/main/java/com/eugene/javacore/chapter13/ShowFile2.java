package com.eugene.javacore.chapter13;

import java.io.*;

public class ShowFile2 {
    public static void main (String args[]) throws IOException
    {
        int i;
        FileInputStream fin=null;
        if (args.length !=1)
        {
            System.out.println("Использовать: ShowFile имя_файла");
            return;
        }
        try{
        fin = new FileInputStream(args[0]);
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
       finally {
            try {
                if (fin!=null) fin.close();
            }catch (IOException e)
            {
                System.out.println("ошибка закрытия файла");
            }
        }
    }
}
