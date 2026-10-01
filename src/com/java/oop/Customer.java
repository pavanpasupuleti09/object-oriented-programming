package com.java.oop;

public class Customer {
    String name;
    int id;
    String email;
    byte age;
    long mobileNumber;

    public Customer() {
        name = "unknown";
        id = 0;
        email = "not available";
        age = 0;
        mobileNumber = 0;

    }

    public Customer(String name, int id, String email, byte age, long mobileNumber) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.age = age;
        this.mobileNumber = mobileNumber;
    }
    void displayCustomerDetails(){
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Email : " + email);
        System.out.println("Age : " + age);
        System.out.println("Mobile Number : " + mobileNumber);
    }

}
