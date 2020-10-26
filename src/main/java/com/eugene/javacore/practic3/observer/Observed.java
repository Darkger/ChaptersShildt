package com.eugene.javacore.practic3.observer;

public interface Observed {
    public void addUser(User user);
    public void removeUser( User user);
    public void notifyUser();

}
