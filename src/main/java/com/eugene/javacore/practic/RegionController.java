package com.eugene.javacore.practic;

import javax.swing.text.View;
import java.io.IOException;
import java.util.List;

public class RegionController {
    public void save(Region region) throws IOException {
        RegionView regionView = new RegionView();
        RegionRepository regionRepository = new RegionRepository();
        region =regionRepository.save(region);
        if( region==null)
            regionView.errorRegionWrited();
        else
        regionView.viewSave(regionRepository.save(region));
    }

    public void deleteById(String str) throws IOException {
        RegionView regionView = new RegionView();
        RegionRepository regionRepository = new RegionRepository();
        regionRepository.deleteById(Long.parseLong(str));
        regionView.viewDeleteById(str);
    }

    public void getRegionById(String str) throws IOException {
        RegionView regionView = new RegionView();
        RegionRepository regionRepository = new RegionRepository();
        Region region =regionRepository.getById(Long.parseLong(str));
        if(region== null)
            regionView.errorNotFoundId();
        else {regionView.viewGetRegionById(region);}
    }

    public void viewUpdate(Region region) throws IOException {
        RegionView regionView = new RegionView();
        RegionRepository regionRepository = new RegionRepository();
        region = regionRepository.update(region);
        if (region!=null) {
            regionView.viewUpdate(region);
        }


    }

    public void getAll() throws IOException {
        RegionView regionView = new RegionView();
        RegionRepository regionRepository = new RegionRepository();
        List <Region> regionList =  regionRepository.getAll();
        if(regionList.isEmpty())
            regionView.errorFileEmpty();
        else
        regionView.viewGetAll(regionList);
    }

}
