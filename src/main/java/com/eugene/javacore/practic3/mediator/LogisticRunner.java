package com.eugene.javacore.practic3.mediator;

public class LogisticRunner {
    public static void main(String[] args) {
        LogisticCenterReal logisticsСenter = new LogisticCenterReal();

        Operator operator = new Operator();
        logisticsСenter.setOperator(operator);
        Transport transport1 = new Transport(logisticsСenter);
        Transport transport2 = new Transport(logisticsСenter);
        Transport transport3 = new Transport(logisticsСenter);
        Transport transport4 = new Transport(logisticsСenter);
        Transport transport5 = new Transport(logisticsСenter);
        Transport transport6 = new Transport(logisticsСenter);
        logisticsСenter.addTransport(transport1);
        logisticsСenter.addTransport(transport2);
        logisticsСenter.addTransport(transport3);
        logisticsСenter.addTransport(transport4);
        logisticsСenter.addTransport(transport5);
        logisticsСenter.addTransport(transport6);
        transport1.ReportAProblem("accident on the road");
        transport1.ReportAProblem("no road");
    }
}
