package com.java.oop;

public class Product {

    String name;
    int id;
    float discountPercentage;
    double maxRetailPrice;
    boolean isAvailable;

    public Product(String name, int id, float discountPercentage,
                   double maxRetailPrice, boolean isAvailable) {

        this.name = name;
        this.id = id;
        this.discountPercentage = discountPercentage;
        this.maxRetailPrice = maxRetailPrice;
        this.isAvailable = isAvailable;
    }

    void displayProductDetails() {
        System.out.println("Product Id : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Product Discount Percentage : " + discountPercentage);
        System.out.println("Product Price : " + maxRetailPrice);
        System.out.println("Product In Stock : " + isAvailable);
    }

    void getSpace() {
        System.out.println();
    }

    // Update product price
    void updateProductPrice(double newPrice) {
        this.maxRetailPrice = newPrice;
    }

    // Return product name
    String getProductName() {
        return name;
    }

    // Return product availability
    boolean getProductAvailability() {
        return isAvailable;
    }

    // Calculate discounted price
    double calculateDiscountedPrice() {
        return maxRetailPrice - (maxRetailPrice * discountPercentage / 100);
    }
}