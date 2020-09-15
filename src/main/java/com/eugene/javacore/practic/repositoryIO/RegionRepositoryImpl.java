package com.eugene.javacore.practic.repositoryIO;

import com.eugene.javacore.practic.model.Region;
import com.eugene.javacore.practic.repository.RegionReposutory;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class RegionRepositoryImpl implements RegionReposutory {
    private Path regionFile = Paths.get("C:\\javaFiles\\region.txt");

    public Region update(Region region) {
        try {
            List<String> listRegFile = Files.readAllLines(regionFile);

            List<String> listId = new ArrayList<>();
            List<String> listRegionCharName = new ArrayList<>();
            if (!listRegFile.isEmpty()) {
                for (String str : listRegFile) {
                    String strArray[] = str.split(",");
                    listId.add(strArray[0]);
                    listRegionCharName.add(strArray[1]);
                }
                if (listId.contains(region.getId())) {
                    if (listRegionCharName.contains(region.getCharRegName())) {
                        System.out.println("введеный Регион уже есть в файле");
                        return null;
                    }
                    listRegionCharName.add(listId.indexOf(region.getId()), region.getCharRegName());
                    Files.delete(regionFile);
                    Files.createFile(regionFile);
                    for (int i = 0; i < listId.size(); i++) {
                        try {
                            Files.writeString(regionFile, listId.get(i) + "," + listRegionCharName.get(i) + "\n", StandardOpenOption.APPEND);

                        } catch (IOException e) {
                            System.out.println("ошибка записи в файл3");
                        }
                    }
                }
                return region;
            }
            System.out.println("файл пуст");
            return null;
        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }

    public Region getById(Long id)  {
        try{
        List<String> listRegFile = Files.readAllLines(regionFile);
        if (!listRegFile.isEmpty()) {
            for (String str : listRegFile) {
                String strArray[] = str.split(",");
                if (strArray[0].equals(String.valueOf(id))) {
                    return new Region(String.valueOf(id), strArray[1]);
                }
            }
        }

        return null;
        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }

    public List<Region> getAll()   {
        try{
        List<String> listRegFile = Files.readAllLines(regionFile);
        List<Region> listRegionObj = new ArrayList<Region>();

        if (!listRegFile.isEmpty()) {
            for (String str : listRegFile) {
                String strArray[] = str.split(",");
                listRegionObj.add(new Region(strArray[0], strArray[1]));
            }
            return listRegionObj;
        }

        return null;
        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }


   public  void deleteById(Long id)   {
        try{
        List<String> listReg = Files.readAllLines(regionFile);
        ArrayList<Long> listId = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strPovtorVvod = "notnull";
        for (String str : listReg) {
            String strArray[] = str.split(",");
            listId.add(Long.parseLong(strArray[0]));
        }
        if (listId.contains(id)) {
            listReg.remove(listId.indexOf(id));
            Files.delete(regionFile);
            Files.createFile(regionFile);
            for (String str : listReg) {
                try {
                    System.out.println(str);

                    Files.writeString(regionFile, str + "\n", StandardOpenOption.APPEND);
                    System.out.println("В файл записаны: id = " + str);
                } catch (IOException e) {
                    System.out.println("ошибка записи в файл3");
                }
            }
        } else {
            System.out.println("id не найден");
        }
        } catch (IOException e) {
            System.out.println(e);

        }
    }


    public Region save(Region region)   {
        int flag = 0;
        try{
        List<String> listReg = Files.readAllLines(regionFile);
        IOUtils.listIdAndMaxVal(listReg);
        List<String> listId = IOUtils.getListId();
        int maxValue = IOUtils.getMaxValue();

        if(region.getId()==null)
            region.setId("");
        switch (region.getId()) {
            case "": {
                for (String str : listReg) {
                    if (str.contains(region.getCharRegName())) {
                        String strArray[] = str.split(",");
                        region.setId(strArray[0]);
                        flag = 1;
                        break;
                    }
                }
                if (flag != 1) {
                    region.setId(String.valueOf(maxValue++));
                }
            }
            default:
                for (String str : listReg) {
                    if (str.contains(region.getCharRegName())) {
                        String strArray[] = str.split(",");
                        region.setId(strArray[0]);
                        flag = 1;
                        break;
                    }
                    if (flag != 1) {
                        if (listId.contains(region.getId()))
                            region.setId(String.valueOf(++maxValue));
                    }
                }
        }
        if (flag != 1) {
            try {
                Files.writeString(regionFile, region.getId() + "," + region.getCharRegName() + "\n", StandardOpenOption.APPEND);


            } catch (IOException e) {
                System.out.println("ошибка записи в файл3");
            }
        }
        return region;
        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }


}




