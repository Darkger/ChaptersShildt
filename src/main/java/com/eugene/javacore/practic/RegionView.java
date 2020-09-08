package com.eugene.javacore.practic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class RegionView {
    public void viewDeleteById(String str) throws IOException {
        RegionController regionController = new RegionController();
        regionController.deleteById(str);
        System.out.println("Регино с id=" + str + " удален из файла");
    }

    public void viewSave(Region region) throws IOException {
        RegionController regionController = new RegionController();
        region = regionController.save(region);
        if (region != null)
            System.out.println("Регино " + "'" + region.getCharRegName() + "'" + " сохранен с id=" + region.getId());
        else System.out.println("Ошбика:Регион не может быть сохранен!");
    }

    public void viewGetAll() throws IOException {
        RegionController regionController = new RegionController();
        List<Region> regionList = regionController.getAll();
        if (regionList.isEmpty())
            System.out.println("Файл пуст");
        else {
            System.out.println("Список регионов:");
            for (Region region : regionList) {
                System.out.println(region.getId() + "," + region.getCharRegName());
            }
        }
    }

    public void viewUpdate(Region region) throws IOException {
        RegionController regionController = new RegionController();
        Region region1 = regionController.Update(region);
        if (region1 != null)
            System.out.println("Идентификатор id=" + region.getId() + " теперь присвоен региону '" + region.getCharRegName() + "'");
        else System.out.println("Ошибка:Регион не может быть изменен");
    }

    public void viewGetRegionById(String str) throws IOException {
        RegionController regionController = new RegionController();
        Region region = regionController.getRegionById(str);
        if (region != null)
            System.out.println("Идентификатор id=" + region.getId() + "принадлежит Региону '" + region.getCharRegName());
        else System.out.println("Регион не найден!");
    }

    public Boolean routing() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("РАБОТА С ФАЙЛОМ  'region.txt':\n\n");
        System.out.println("Доступный список действий:\n ");
        System.out.println("1. Введите команду -'LIST'   чтобы получить список регионов");
        System.out.println("2. Введите команду -'BYID'   чтобы получить регион по id ");
        System.out.println("3. Введите команду -'SAVE'   чтобы сохранить регион");
        System.out.println("4. Введите команду -'UPDATE' чтобы изменить регион");
        System.out.println("5. Введите команду -'DELETE' чтобы удалить  регион");
        String str = reader.readLine();
        switch (str) {
            case "LIST": {
                viewGetAll();
                break;
            }
            case "BYID": {
                System.out.println("Введите id7: ");
                String id = reader.readLine();
                viewGetRegionById(id);
                break;

            }
            case "SAVE": {
                System.out.println("Введите id3: ");
                String id = reader.readLine();
                System.out.println("Введите Регион: ");
                String regionName = reader.readLine();
                Region region = new Region(id, regionName);
                viewSave(region);
                break;
            }
            case "UPDATE": {
                System.out.println("Введите id2: ");
                String id = reader.readLine();
                System.out.println("Введите Регион: ");
                String regionName = reader.readLine();
                Region region = new Region(id, regionName);
                viewUpdate(region);
                break;
            }
            case "DELETE": {
                System.out.println("Введите id1: ");
                String id = reader.readLine();
                viewDeleteById(id);
                break;
            }
        }
        System.out.println("Продолжить работу? Y/N :");
        str = reader.readLine();
        if (str.equals("N"))
            return false;
        else return true;
    }
}