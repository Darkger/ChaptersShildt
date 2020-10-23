package com.eugene.javacore.practic3.builder;

public class Director {
    CreditBuilder creditBuilder;
    public void setCreditBuilder(CreditBuilder creditBuilder){
        this.creditBuilder=creditBuilder;
    }
    public Credit createCredit(){
        creditBuilder.createCredit();
        creditBuilder.setPrice();
        creditBuilder.setType();
        creditBuilder.setYears();
        Credit credit = creditBuilder.getCredit();
        return credit;
    }
}
