package com.eugene.javacore.practic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main  {
    public static void main(String[] args) throws IOException {
        Region region = new Region("6","GER");
        RegionController regionController = new RegionController();
        regionController.deleteById("4");
        regionController.getAll();
        regionController.getRegionById("99");
        regionController.save(region);
        regionController.viewUpdate(new Region("5","POL3"));
    }
}
