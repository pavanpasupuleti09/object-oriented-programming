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
        Customer customer = new Customer("shiva",11,"shiva@gmail.com", (byte) 22,9870800765L);
        System.out.println("                        ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                        ");
        System.out.println("Customer name : " + customer.name);
        System.out.println("Customer Id : " + customer.id);
        System.out.println("Customer Mail : " + customer.email);
        System.out.println("Customer Age : " + customer.age);
        System.out.println("Customer contact : " + customer.mobileNumber);
        System.out.println("                        ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                        ");
        Customer customer2 = new Customer("saii",44,"saii@gmail.com",(byte)23,9089899098L);
        Customer customer3 = new Customer("naj",12,"naj@gmail.com",(byte) 23,8768677876L);
        Customer customer4 = new Customer("mai",23,"mai@gmail.com",(byte)22,9878788989L);
        Customer customer5 = new Customer("tai",22,"tai@gmail.com",(byte)22,9878677876L);
        System.out.println("                        ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                        ");
        System.out.println("Customer name : " + customer2.name);
        System.out.println("Customer Id : " + customer2.id);
        System.out.println("Customer Mail : " + customer2.email);
        System.out.println("Customer Age : " + customer2.age);
        System.out.println("Customer contact : " + customer2.mobileNumber);
        System.out.println("                        ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                        ");
        System.out.println("Customer name : " + customer3.name);
        System.out.println("Customer Id : " + customer3.id);
        System.out.println("Customer Mail : " + customer3.email);
        System.out.println("Customer Age : " + customer3.age);
        System.out.println("Customer contact : " + customer3.mobileNumber);
        System.out.println("                        ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                        ");
        System.out.println("Customer name : " + customer4.name);
        System.out.println("Customer Id : " + customer4.id);
        System.out.println("Customer Mail : " + customer4.email);
        System.out.println("Customer Age : " + customer4.age);
        System.out.println("Customer contact : " + customer4.mobileNumber);
        System.out.println("                        ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                        ");
        System.out.println("Customer name : " + customer5.name);
        System.out.println("Customer Id : " + customer5.id);
        System.out.println("Customer Mail : " + customer5.email);
        System.out.println("Customer Age : " + customer5.age);
        System.out.println("Customer contact : " + customer5.mobileNumber);
        System.out.println("                        ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                        ");





    }
}