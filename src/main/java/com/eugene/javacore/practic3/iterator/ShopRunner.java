package com.eugene.javacore.practic3.iterator;

public class ShopRunner {
    public static void main(String[] args) {
        String[] products = {"Milk","Water","Ice cream"};
        Shop shop = new Shop("Okey",products);
        Iterator iterator = shop.getIterator();
        System.out.println("Shop: "+ shop.getName());
        System.out.println("Products: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString()+ " ");
        }
    }
}
