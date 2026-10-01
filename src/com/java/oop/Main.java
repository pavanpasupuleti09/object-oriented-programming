//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.java.oop;


public class Main {
    public static void main(String[] args) {
        Product product = new Product("Apple",1,9.5F,59000,true);
        Product product2 = new Product("samsung",2,7.5F,67000,true);
        Customer customer = new Customer("shiva",11,"shiva@gmail.com", (byte) 22,9870800765L);
        Customer customer2 = new Customer("saii",44,"saii@gmail.com",(byte)23,9089899098L);
        Customer customer3 = new Customer("naj",12,"naj@gmail.com",(byte) 23,8768677876L);
        Customer customer4 = new Customer("mai",23,"mai@gmail.com",(byte)22,9878788989L);
        Customer customer5 = new Customer("tai",22,"tai@gmail.com",(byte)22,9878677876L);



        product.displayProductDetails();
        product.getSpace();
        product2.displayProductDetails();
        product.getSpace();
        customer.displayCustomerDetails();
        product.getSpace();
        customer2.displayCustomerDetails();
        product.getSpace();
        customer3.displayCustomerDetails();
        product.getSpace();
        customer4.displayCustomerDetails();
        product.getSpace();
        customer5.displayCustomerDetails();







    }
}