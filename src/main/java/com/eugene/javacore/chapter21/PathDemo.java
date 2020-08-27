package com.eugene.javacore.chapter21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) throws IOException {
        Path filepath = Paths.get("examples\\test.txt");
        System.out.println("Имя файла "+ filepath.getFileName());
        System.out.println("Путь к файлу:"+ filepath);
        System.out.println("Абсолютный путь к файлу: "+ filepath.toAbsolutePath());
        System.out.println("Родительский каталог:"+ filepath.getParent());
        if(Files.exists(filepath)) {
            System.out.println("Файл существует");
        }
            else
        {
                System.out.println("Файл не существует ");
        }
            if(Files.isHidden(filepath))
                System.out.println("файл скрыт ");
            else
                System.out.println();
    }
}
