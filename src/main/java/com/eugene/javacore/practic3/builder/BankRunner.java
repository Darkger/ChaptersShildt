package com.eugene.javacore.practic3.builder;

public class BankRunner {
    public static void main(String[] args) {
   Director director= new Director();
director.setCreditBuilder(new FastCredit());

Credit credit= director.createCredit();
System.out.println(credit.toString());
    }
}
