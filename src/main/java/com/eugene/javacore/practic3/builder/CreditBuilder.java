package com.eugene.javacore.practic3.builder;

public abstract class CreditBuilder {
    Credit credit;

    public void  createCredit() {
        credit = new Credit();
    }
    public abstract  void setYears();
    public abstract  void setType();
    public abstract void setPrice();

    Credit getCredit(){
        return  credit;
    }


}
