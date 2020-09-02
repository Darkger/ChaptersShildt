package com.eugene.javacore.practic;

public class Main  {
    public static void main(String[] args) {
        Region region = new Region();
        region.setId("2");
        region.setCharRegName("rr ");
        RegionRepository repository = new RegionRepository();
        repository.save(region);
    }
}
