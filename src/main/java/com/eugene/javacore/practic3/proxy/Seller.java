package com.eugene.javacore.practic3.proxy;

public class Seller  implements Deal{
    String product;

    public Seller(String product) {
        this.product = product;
        productSell();
    }

    public void productSell(){
        System.out.println("A transaction is being made for the sale of goods : "+product);
    }
    @Override
    public void makeADeal() {
      System.out.println("The transaction is made");
    }
}
