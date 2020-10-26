package com.eugene.javacore.practic3.mediator;

public class Transport implements  Responsible {
    LogisticsСenter logisticsСenter;

    public Transport(LogisticsСenter logisticsСenter) {
        this.logisticsСenter = logisticsСenter;
    }



    @Override
    public void InformationAboutTheProblemtTheWay(String problem) {
        System.out.println("Transport notified of the problem:"+ problem);
    }

    @Override
    public void ReportAProblem(String problem) {
logisticsСenter.InformationAboutTheProblemtTheWay(problem,this);
    }
}
