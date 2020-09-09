package com.eugene.javacore.practic.Region;

import com.eugene.javacore.practic.Genericrepository;

import java.util.List;

public interface RegionReposutoryImpl extends Genericrepository<Region,Long> {

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
