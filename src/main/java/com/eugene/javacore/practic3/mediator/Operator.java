package com.eugene.javacore.practic3.mediator;

public class Operator implements Responsible {
 LogisticsСenter logisticsСenter;
    @Override
    public void InformationAboutTheProblemtTheWay(String problem) {
        System.out.println("Operator: "+problem);
    }

    @Override
    public void ReportAProblem(String problem) {
 logisticsСenter.InformationAboutTheProblemtTheWay(problem,this);
    }
}
