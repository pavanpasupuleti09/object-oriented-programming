package com.java.oop;

public class Product {
    int id;
    String name;
    int price;
    float rating;
    int reviewsCount;
    byte discountPercentage;
    boolean isAvailable;
    String category;
    String company;

    public Product(int id, int price, float rating, int reviewsCount, byte discountPercentage, boolean isAvailable, String category, String company) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.reviewsCount = reviewsCount;
        this.discountPercentage = discountPercentage;
        this.isAvailable = isAvailable;
        this.category = category;
        this.company = company;
    }

    Product() {
        System.out.println("Coustomer constructor called");
        id = 123;
        name = " Asus laptop";
        price = 123444;
        rating = 4.5F;
        reviewsCount = 2233;
        discountPercentage = 16;
        isAvailable = true;
        category = "laptops";
        company = "Asus";






    }



}
