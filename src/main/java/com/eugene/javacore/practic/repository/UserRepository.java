package com.eugene.javacore.practic.repository;

import com.eugene.javacore.practic.model.User;

import java.util.List;

public interface UserRepository extends Genericrepository<User,Long> {
    @Override
    User getById(Long aLong);

    @Override
    List<User> getAll();

    @Override
    User save(User user);

    @Override
    User update(User user);

    @Override
    void deleteById(Long aLong);
}
