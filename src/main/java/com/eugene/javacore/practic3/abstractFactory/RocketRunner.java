package com.eugene.javacore.practic3.abstractFactory;

import com.eugene.javacore.practic3.abstractFactory.USERocket.UseRocketFactory;
import com.eugene.javacore.practic3.abstractFactory.russianRocket.RussianRocketFactory;

public class RocketRunner {
    public static void main(String[] args) {
        RocketFactory russianRocketFactory = new RussianRocketFactory();
        Stages stage1= russianRocketFactory.createFirstStage();
        Stages stage2= russianRocketFactory.createSecondStage();
        Stages stage3= russianRocketFactory.createThirdStage();
        stage1.creatStage();
        stage2.creatStage();
        stage3.creatStage();
        System.out.println("Russian rocket is creat");
        System.out.println();
        System.out.println();
        RocketFactory useRocketFactory = new UseRocketFactory();
        Stages part1= useRocketFactory.createFirstStage();
        Stages part2= useRocketFactory.createSecondStage();
        Stages part3= useRocketFactory.createThirdStage();
        part1.creatStage();
        part2.creatStage();
        part3.creatStage();
        System.out.println("USE rocket is creat");
    }

}
