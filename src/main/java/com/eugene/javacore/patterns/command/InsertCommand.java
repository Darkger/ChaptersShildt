package com.eugene.javacore.patterns.command;

import com.eugene.javacore.patterns.adapter.Database;

public class InsertCommand implements Command {
      DataBase dataBase;


    public InsertCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.insert();
    }
}
