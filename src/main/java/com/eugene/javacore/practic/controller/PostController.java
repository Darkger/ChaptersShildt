package com.eugene.javacore.practic.controller;


import com.eugene.javacore.practic.model.Post;
import com.eugene.javacore.practic.repositoryIO.PostRepositoryImpl;

import java.io.IOException;
import java.util.List;

public class PostController {
    PostRepositoryImpl regionRepository = new PostRepositoryImpl();

    public Post save(Post post) throws IOException {

        post = regionRepository.save(post);
        if (post == null)
            return null;
        else
            return regionRepository.save(post);
    }

    public void deleteById(String str) throws IOException {

        regionRepository.deleteById(Long.parseLong(str));
    }

    public Post getPostById(String str) throws IOException {

        Post post = regionRepository.getById(Long.parseLong(str));
        if (post == null)
            return null;
        else {
            return post;
        }
    }

    public Post Update(Post post) throws IOException {

        post = regionRepository.update(post);
        if (post != null) {
            return post;
        } else return null;


    }

    public List<Post> getAll() throws IOException {

        List<Post> postList = regionRepository.getAll();
        if (postList==null)
            return null;
        else
            return postList;
    }

}
