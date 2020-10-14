package com.eugene.javacore.patterns.command;

import javax.xml.crypto.Data;

public class DatabaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        Developer developer = new Developer(new InsertCommand(dataBase),new UpdateCommand(dataBase),new SelectCommand(dataBase));

    }
}
