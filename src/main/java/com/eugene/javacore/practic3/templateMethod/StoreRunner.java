package com.eugene.javacore.practic3.templateMethod;

public class StoreRunner {
    public static void main(String[] args) {
        Shop shop1 = new ClothingStore();
        shop1.showcase();
        Shop shop2 = new GroceryStore();
        shop2.showcase();
    }
}
