package com.eugene.javacore.chapter20;

import java.io.*;

public class FileDemo {
    static void p(String s)
    {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File ("/java/COPYRIGHT");
        p("Имя файла"+f1.getName());
        p("Путь "+f1.getPath());
        p("Абсолютный путь "+f1.getAbsolutePath());
        p("родительский каталог "+f1.getParent());
        p(f1.exists() ? "существует":"не существует");
        p(f1.canWrite() ? "доступен для записи":"не доступен для записи");
        p(f1.canRead() ? "доступен для чтения":"не доступен для чтения");
        p(f1.isDirectory() ? "является каталогом":"не является каталогом");
        p(f1.isFile() ? "является файлом":"не явялется файлом");
        p(f1.isAbsolute() ? "является асболютным": "не является абсолютным");
        p("последние изменения в файле "+ f1.lastModified());
        p("размер  "+ f1.length() + "байт");
    }
}
