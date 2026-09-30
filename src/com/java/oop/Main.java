//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.java.oop;


public class Main {
    public static void main(String[] args) {
        Product product = new Product("Apple",1,9.5F,59000,true);
        System.out.println("Product Id : " + product.id);
        System.out.println("Product name : " + product.name);
        System.out.println("Product Discount Percentage : " + product.discountPercentage);
        System.out.println("Product Price : " + product.maxRetailPrice);
        System.out.println("Product in Stock : " + product.isAvailable);
        System.out.println("                                                                               ");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("                                                                               ");
        Product product2 = new Product("samsung",2,7.5F,67000,true);
        System.out.println("Product Id : " + product2.id);
        System.out.println("Product name : " + product2.name);
        System.out.println("Product Discount Percentage : " + product2.discountPercentage);
        System.out.println("Product Price : " + product2.maxRetailPrice);
        System.out.println("Product in Stock : " + product2.isAvailable);



    }
}