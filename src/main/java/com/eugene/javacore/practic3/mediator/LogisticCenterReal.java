package com.eugene.javacore.practic3.mediator;

import java.util.ArrayList;
import java.util.List;

public class LogisticCenterReal implements  LogisticsСenter {
    Operator operator;
    List<Transport> transportList = new ArrayList<>();

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void addTransport(Transport transport) {
        transportList.add(transport);
    }

    @Override
    public void InformationAboutTheProblemtTheWay(String problem, Responsible transport) {
        for( Transport t: transportList){
            if(t!=transport){
                transport.InformationAboutTheProblemtTheWay(problem);
            }
        }
        operator.InformationAboutTheProblemtTheWay(problem);
    }
}
