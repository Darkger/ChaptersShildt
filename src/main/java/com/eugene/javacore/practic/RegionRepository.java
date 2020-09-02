package com.eugene.javacore.practic;

import java.io.*;
import java.nio.file.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegionRepository {
    private Region region;
    private HashMap<String, String> mapReg = new HashMap<>();
    private Path regionFile = Paths.get("C:\\javaFiles\\region.txt");
    private int maxId = 0;

    //в данном методе возвращаю мапу с ключом ID и значением Регион
    public HashMap<String, String> regionMap() {

        try {
            List<String> listReg = Files.readAllLines(regionFile);
            for (String n : listReg) {
                String str[] = n.split(",");
                mapReg.put(str[0], str[1]);
                if (maxId < Integer.parseInt(str[0]))
                    maxId = Integer.parseInt(str[0]);
            }

            return mapReg;
        } catch (IOException e) {
            System.out.println("IOException");
            return null;
        }
    }

    public RegionRepository(Region region) {
        this.region = region;
    }

    //-----Метод save сохраняет id и Регион в файл,
    //-----в случае если id не указан, то id генерируется, и присваивается в region.id
    //-----в случае если  id совпадает с другим регионом в файле, то id генерируется и присваивается в region.id
    //-----в случае если уникалный id и регион, то они записываются в файл
    //-----в случае если уникальный регион, но id совпадает с другим id в файле, то id генерируется и присваивается в region.id
    public void save() {
        mapReg = regionMap();
        int flag = 0;
        int key = 0;
        if (!mapReg.isEmpty()) {
            // mapReg.forEach((k, v) -> System.out.println(k + " " + v));
            System.out.println();
            for (Map.Entry<String, String> pair : mapReg.entrySet()) {
                key = Integer.parseInt(pair.getKey());
                // System.out.println(key);
                if (region.getCharRegName().equals(pair.getValue())) {
                    region.setId(pair.getKey());
                    flag = 1;
                    break;
                }
            }
            if (flag != 1) {
                if (!region.getId().equals("")) {
                    if (mapReg.containsKey(region.getId())) {
                        maxId++;
                        region.setId(String.valueOf(maxId));
                    }
                } else {
                    maxId++;
                    region.setId(String.valueOf(maxId));
                }
                try {
                    Files.writeString(regionFile, "\n" + region.getId() + "," + region.getCharRegName(), StandardOpenOption.APPEND);
                    System.out.println("В файл записаны: id = "+region.getId()+" Регион = "+region.getCharRegName());
                } catch (IOException e) {
                    System.out.println("ошибка записи в файл2");
                }
            } else {
                region.setId(String.valueOf(key));
            }

        } else {
            if (region.getId().equals("")) {
                region.setId("1");
            }
            try {

                Files.writeString(regionFile, region.getId() + "," + region.getCharRegName(), StandardOpenOption.APPEND);
                System.out.println("В файл записаны: id = "+region.getId()+" Регион = "+region.getCharRegName());
            } catch (IOException e) {
                System.out.println("ошибка записи в файл3");
            }

        }

    }
}
