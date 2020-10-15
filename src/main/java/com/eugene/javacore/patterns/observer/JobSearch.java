package com.eugene.javacore.patterns.observer;

import com.eugene.javacore.patterns.iterator.JavaDeveloper;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobsite = new JavaDeveloperJobSite();
        jobsite.addVacancy("First  Java Position");
        jobsite.addVacancy("Second Java Position");
        Observer firstSubscriber = new Subscriber("Eugene Suleimanov");
        Observer secondSubscriber = new Subscriber("Peter Romanenko");
        jobsite.addObserver(firstSubscriber);
        jobsite.addObserver(secondSubscriber);
        jobsite.addVacancy("Third java position");
    }
}
