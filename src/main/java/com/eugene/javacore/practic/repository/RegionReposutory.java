package com.eugene.javacore.practic.repository;

import com.eugene.javacore.practic.model.Region;

import java.util.List;

public interface RegionReposutory extends Genericrepository<Region,Long> {

    @Override
    Region getById(Long aLong);

    @Override
    List<Region> getAll();

    @Override
    Region save(Region region);

    @Override
    Region update(Region region);

    @Override
    void deleteById(Long aLong);
}
