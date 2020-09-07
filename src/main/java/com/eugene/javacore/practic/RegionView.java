package com.eugene.javacore.practic;

import java.util.List;

public class RegionView {
    public void viewDeleteById(String str){
        System.out.println("Регино с id="+str+" удален из файла");
    }
    public void viewSave(Region region){
        System.out.println("Регино "+"'"+region.getCharRegName()+"'"+" сохранен с id="+region.getId());
    }
    public void viewGetAll(List<Region> list){
        System.out.println("Список регионов:");
        for(Region region:list)
        {
            System.out.println(region.getId()+","+region.getCharRegName());
        }
    }
    public void viewUpdate(Region region){
        System.out.println("Идентификатор id="+region.getId()+" теперь присвоен региону '"+region.getCharRegName()+"'");
    }
    public void viewGetRegionById(Region region){
        System.out.println("Идентификатор id="+region.getId()+"принадлежит Региону '"+region.getCharRegName());
    }
    public void errorFileEmpty ()
    {
        System.out.println("файл пуст ");
    }
    public void errorTwoRegionInFile  ()
    {
        System.out.println("Введеный регион уже есть в файле ");
    }
    public void errorNotFoundId  ()
    {
        System.out.println("id не найден ");
    }
    public void errorRegionWrited  ()
    {
        System.out.println("Регион уже записан ");
    }
}
