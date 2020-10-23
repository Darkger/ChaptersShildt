package com.eugene.javacore.practic3.proxy;

public class ProxySeller  implements  Deal{
Deal seller;
String product;

    public ProxySeller( String product) {
        this.product = product;
    }

    @Override
    public void makeADeal() {
        if (seller==null){
            seller=new Seller(product);
        }
        seller.makeADeal();
    }
}
