package com.eugene.javacore.practic3.iterator;
public class Shop implements Collection {
    private String name;
    private String[] products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    public Shop(String name, String[] skills) {
        this.name = name;
        this.products = skills;
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator();
    }
    private class ProductIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if(index< products.length){
                return true;}
            return false;
        }

        @Override
        public Object next() {
            return products[index++];
        }
    }
}

