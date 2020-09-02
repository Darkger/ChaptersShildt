package com.eugene.javacore.practic;

public class Main  {
    public static void main(String[] args) {
        Region region = new Region();
        region.setId("1");
        region.setCharRegName("USE");
        RegionRepository repository = new RegionRepository(region);
        repository.save();
    }
}
