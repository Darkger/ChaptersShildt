package com.eugene.javacore.practic3.builder;

public class LongCredit extends CreditBuilder {
    @Override
    public void setYears() {
        credit.years=15;
    }

    @Override
    public void setType() {
credit.type=Type.MortgageCredit;
    }

    @Override
    public void setPrice() {
credit.price=10000000;
    }
}
