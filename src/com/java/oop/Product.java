package com.java.oop;

public class Product {
    String name ;
    int id ;
    float discountPercentage;
    double maxRetailPrice;
    boolean isAvailable;

    public Product(String name, int id, float discountPercentage, double maxRetailPrice, boolean isAvailable) {
        this.name = name;
        this.id = id;
        this.discountPercentage = discountPercentage;
        this.maxRetailPrice = maxRetailPrice;
        this.isAvailable = isAvailable;
    }
}