package com.eugene.javacore.practic.CONTROLLERS;


import com.eugene.javacore.practic.ESSENCES.Post;
import com.eugene.javacore.practic.REPOSITORYS.PostRepository;

import java.io.IOException;
import java.util.List;

public class PostController {
    PostRepository regionRepository = new PostRepository();

    public Post save(Post region) throws IOException {

        region = regionRepository.save(region);
        if (region == null)
            return null;
        else
            return regionRepository.save(region);
    }

    public void deleteById(String str) throws IOException {

        regionRepository.deleteById(Long.parseLong(str));
    }

    public Post getRegionById(String str) throws IOException {

        Post region = regionRepository.getById(Long.parseLong(str));
        if (region == null)
            return null;
        else {
            return region;
        }
    }

    public Post Update(Post region) throws IOException {

        region = regionRepository.update(region);
        if (region != null) {
            return region;
        } else return null;


    }

    public List<Post> getAll() throws IOException {

        List<Post> regionList = regionRepository.getAll();
        if (regionList==null)
            return null;
        else
            return regionList;
    }

}
