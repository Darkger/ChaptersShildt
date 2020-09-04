package com.eugene.javacore.practic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main  {
    public static void main(String[] args) throws IOException {
        Region region = new Region();
        region.setId("7");
        region.setCharRegName("uuu");
        RegionRepository repository = new RegionRepository();
        repository.save(region);
        repository.deleteById((long) 2);

        for (Region region1 :repository.getAll())
        {
            System.out.println("get.all:"+region1.getId()+","+region1.getCharRegName());
        }
        repository.update(new Region("19","ZEX"));
        Region  getRegionById = repository.getById((long)19);
       System.out.println("Найденный регион :\n"+getRegionById.getId()+","+getRegionById.getCharRegName());
    }
}
