package com.eugene.javacore.practic.REPOSIMPLS;

import com.eugene.javacore.practic.ESSENCES.User;
import com.eugene.javacore.practic.Genericrepository;

import java.util.List;

public interface UserRepositoryImpl extends Genericrepository<User,Long> {
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
