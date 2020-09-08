package com.eugene.javacore.practic;

import javax.swing.text.View;
import java.io.IOException;
import java.util.List;

public class RegionController {
    public Region save(Region region) throws IOException {
        RegionRepository regionRepository = new RegionRepository();
        region =regionRepository.save(region);
        if( region==null)
            return  null;
        else
        return  regionRepository.save(region);
    }

    public void deleteById(String str) throws IOException {

        RegionRepository regionRepository = new RegionRepository();
        regionRepository.deleteById(Long.parseLong(str));
    }

    public Region getRegionById(String str) throws IOException {
        RegionView regionView = new RegionView();
        RegionRepository regionRepository = new RegionRepository();
        Region region =regionRepository.getById(Long.parseLong(str));
        if(region== null)
            return null;
        else {return region;}
    }

    public Region  Update(Region region) throws IOException {
        RegionView regionView = new RegionView();
        RegionRepository regionRepository = new RegionRepository();
        region = regionRepository.update(region);
        if (region!=null) {
            return region;
        }
        else return null;


    }

    public List<Region> getAll() throws IOException {
        RegionView regionView = new RegionView();
        RegionRepository regionRepository = new RegionRepository();
        List <Region> regionList =  regionRepository.getAll();
        if(regionList.isEmpty())
            return null;
        else
        return regionList;
    }

}
