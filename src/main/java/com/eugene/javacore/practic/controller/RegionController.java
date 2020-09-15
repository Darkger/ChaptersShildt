package com.eugene.javacore.practic.controller;

import com.eugene.javacore.practic.model.Region;
import com.eugene.javacore.practic.repository.repositoryIO.RegionRepositoryImpl;

import java.io.IOException;
import java.util.List;

public class RegionController {
    RegionRepositoryImpl regionRepository = new RegionRepositoryImpl();
    public Region save(Region region) throws IOException {

        region = regionRepository.save(region);
        if (region == null)
            return null;
        else
            return regionRepository.save(region);
    }

    public void deleteById(String str) throws IOException {

        regionRepository.deleteById(Long.parseLong(str));
    }

    public Region getRegionById(String str) throws IOException {

        Region region = regionRepository.getById(Long.parseLong(str));
        if (region == null)
            return null;
        else {
            return region;
        }
    }

    public Region Update(Region region) throws IOException {

        region = regionRepository.update(region);
        if (region != null) {
            return region;
        } else return null;


    }

    public List<Region> getAll() throws IOException {

        List<Region> regionList = regionRepository.getAll();
        if (regionList.isEmpty())
            return null;
        else
            return regionList;
    }

}
