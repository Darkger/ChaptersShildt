package com.eugene.javacore.practic3.proxy;

public class PurchaseRunner {
    public static void main(String[] args) {
        Deal purchase = new ProxySeller("Jacket");
        purchase.makeADeal();

    }
}
