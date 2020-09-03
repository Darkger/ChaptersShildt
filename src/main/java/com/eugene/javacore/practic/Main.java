package com.eugene.javacore.practic;

import java.io.IOException;

public class Main  {
    public static void main(String[] args) throws IOException {
        Region region = new Region();
        region.setId("");
        region.setCharRegName("Zle ");
        RegionRepository repository = new RegionRepository();
        repository.save(region);
    }
}
