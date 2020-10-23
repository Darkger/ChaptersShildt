package com.eugene.javacore.practic3.builder;

public class FastCredit extends CreditBuilder {


    @Override
    public void setYears() {
        credit.years=10;
    }

    @Override
    public void setType() {
credit.type= Type.Consumerloan;
    }

    @Override
    public void setPrice() {
credit.price=10000;
    }
}
