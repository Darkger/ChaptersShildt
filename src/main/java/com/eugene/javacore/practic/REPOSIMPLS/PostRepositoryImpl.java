package com.eugene.javacore.practic.REPOSIMPLS;

import com.eugene.javacore.practic.ESSENCES.Post;
import com.eugene.javacore.practic.Genericrepository;

import java.util.List;

public interface PostRepositoryImpl extends Genericrepository<Post,Long>  {
    @Override
    Post getById(Long aLong);

    @Override
    List<Post> getAll();

    @Override
    Post save(Post post);

    @Override
    Post update(Post post);

    @Override
    void deleteById(Long aLong);
}
