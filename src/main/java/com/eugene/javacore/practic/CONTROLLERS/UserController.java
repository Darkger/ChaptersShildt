package com.eugene.javacore.practic.CONTROLLERS;

import com.eugene.javacore.practic.ESSENCES.Post;
import com.eugene.javacore.practic.ESSENCES.User;
import com.eugene.javacore.practic.REPOSITORYS.PostRepository;
import com.eugene.javacore.practic.REPOSITORYS.UserRepository;

import java.io.IOException;
import java.util.List;

public class UserController {
    UserRepository userRepository = new UserRepository();

    public User save(User user) throws IOException {

        user = userRepository.save(user);
        if (user == null)
            return null;
        else
            return userRepository.save(user);
    }

    public void deleteById(String str) throws IOException {

        userRepository.deleteById(Long.parseLong(str));
    }

    public User getUserById(String str) throws IOException {

       User user = userRepository.getById(Long.parseLong(str));
        if (user == null)
            return null;
        else {
            return user;
        }
    }

    public User Update(User user) throws IOException {

        user = userRepository.update(user);
        if (user != null) {
            return user;
        } else return null;


    }

    public List<User> getAll() throws IOException {

        List<User> userList = userRepository.getAll();
        if (userList==null)
            return null;
        else
            return userList;
    }

}
