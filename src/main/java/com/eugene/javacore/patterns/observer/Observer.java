package com.eugene.javacore.patterns.observer;

import java.util.List;

public interface Observer {
    public  void  handleEvent(List<String> vacancies);
}
