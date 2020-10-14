package com.eugene.javacore.patterns.command;

public class Developer {
    Command insert;
    Command update;
    Command select;

    public Developer(Command insert, Command update, Command select) {
        this.insert = insert;
        this.update = update;
        this.select = select;
    }
    public void insertRecord(){
        insert.execute();
    }
    public void updateRecord(){
        update.execute();
    }
    public void selectRecord(){
        select.execute();
    }
}
