package com.eugene.javacore.chapter20;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

class InputStreamEnumerator implements Enumeration<FileInputStream> {
    private  Enumeration<String> files;
    @Override
    public boolean hasMoreElements() {
        return   files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement().toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public InputStreamEnumerator(Vector<String > files) {
        this.files=files.elements();
    }
}
class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector <String> files = new Vector<>();
        files.add("file1.txt");
        files.add("file2.txt");
        files.add("file3.txt");
        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        InputStream input = new SequenceInputStream(ise);
        try{
            while ((c=input.read())!=-1)
            {
                System.out.println((char) c );

            }

        }catch (IOException e)
        {
            System.out.println(("Ошибка открытия файла "));
        }
        finally {
             try {
                 input.close();
             }catch (IOException e)
             {
                 System.out.println("ошибка закрытия потока SequenceInputStream");
             }
        }

    }
}
