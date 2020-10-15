package com.eugene.javacore.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements  Observed {
    List<String> vacansies =new ArrayList<>();
    List<Observer> subscribes = new ArrayList<>();
    public void addVacancy (String vacancy){
        this.vacansies.add(vacancy);
        notifyObservers();
    }
 public void removeVacancy(String vacancy){
        this.vacansies.remove(vacancy);
        notifyObservers();
 }
    @Override
    public void addObserver(Observer observer) {
this.subscribes.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
this.subscribes.remove(observer);
    }

    @Override
    public void notifyObservers() {
for(Observer observer:subscribes){
    observer.handleEvent(this.vacansies);
}
    }
}
