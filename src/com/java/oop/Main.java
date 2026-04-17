package com.java.oop;

public class Main {


    public static void main(String[] args) {
        Product product1;
        product1 = new Product();
        product1.id = 1;
        product1.name = "iPhone 17 Pro 256 GB";
        product1.price = 134900;
        product1.category = "Mobile";
        product1.discountPercentage = 0;
        product1.company = "Apple";
        product1.rating = 4.4F;
        product1.reviewsCount = 332;
        product1.isAvailable = true;
        System.out.println("---------------------------------------");
        System.out.println("Id no : " + product1.id);
        System.out.println("Name of product : " + product1.name);
        System.out.println("Retail price : " + product1.price);
        System.out.println("Discount Percentage : " + product1.discountPercentage);
        System.out.println("Company  : " + product1.company);
        System.out.println("Product Rating : " + product1.rating);
        System.out.println("No Of Reviews : " + product1.reviewsCount);
        System.out.println("Product Is Available : " + product1.isAvailable);
        System.out.println("\n");


        Product product2;
        product2 = new Product();
        product2.id = 2;
        product2.name = "iPhone Air 256 GB";
        product2.price = 94990;
        product2.category = "Mobile";
        product2.discountPercentage = 21;
        product2.company = "Apple";
        product2.rating = 4.6F;
        product2.reviewsCount = 21;
        product2.isAvailable = true;
        System.out.println("-------------------------------");
        System.out.println("Id no : " + product2.id);
        System.out.println("Name of product : " + product2.name);
        System.out.println("Retail price : " + product2.price);
        System.out.println("Discount Percentage : " + product2.discountPercentage);
        System.out.println("Company  : " + product2.company);
        System.out.println("Product Rating : " + product2.rating);
        System.out.println("No Of Reviews : " + product2.reviewsCount);
        System.out.println("Product Is Available : " + product2.isAvailable);
        System.out.println("\n");
        System.out.println("\n");

//no args
    Customer customer5 = new Customer();
        System.out.println("-------------------------------");
        System.out.println("Id no : " + customer5.id);
        System.out.println("Name  : " + customer5.name);
        System.out.println("Mobile No : " + customer5.mobileNumber);
        System.out.println("Gender  : " + customer5.gender);
        System.out.println("Age  : " + customer5.age);
        System.out.println("\n");
        System.out.println("\n");


// args
    Customer customer6 = new Customer(111,"pavan",9180099090L,'M',23);
        System.out.println("-------------------------------");
        System.out.println("Id no : " + customer6.id);
        System.out.println("Name  : " + customer6.name);
        System.out.println("Mobile No : " + customer6.mobileNumber);
        System.out.println("Gender  : " + customer6.gender);
        System.out.println("Age  : " + customer6.age);
        System.out.println("\n");
        System.out.println("\n");


Product product3 = new Product();
        System.out.println("---------------------------------------");
        System.out.println("Id no : " + product3.id);
        System.out.println("Name of product : " + product3.name);
        System.out.println("Retail price : " + product3.price);
        System.out.println("Discount Percentage : " + product1.discountPercentage);
        System.out.println("Company  : " + product3.company);
        System.out.println("Product Rating : " + product3.rating);
        System.out.println("No Of Reviews : " + product3.reviewsCount);
        System.out.println("Product Is Available : " + product3.isAvailable);
        System.out.println("\n");


        Product product4 = new Product(221,122222,2.3F,2332,(byte)23,true,"laptops","Asus");
        System.out.println("---------------------------------------");
        System.out.println("Id no : " + product3.id);
        System.out.println("Name of product : " + product3.name);
        System.out.println("Retail price : " + product3.price);
        System.out.println("Discount Percentage : " + product1.discountPercentage);
        System.out.println("Company  : " + product3.company);
        System.out.println("Product Rating : " + product3.rating);
        System.out.println("No Of Reviews : " + product3.reviewsCount);
        System.out.println("Product Is Available : " + product3.isAvailable);
        System.out.println("\n");





































        }
}