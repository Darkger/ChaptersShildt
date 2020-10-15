package com.eugene.javacore.patterns.visitor;

import com.eugene.javacore.patterns.command.DataBase;

public interface Developer {
    public  void create(ProjectClass projectClass);
    public  void create(Database dataBase);
    public  void create(Test test);


}
