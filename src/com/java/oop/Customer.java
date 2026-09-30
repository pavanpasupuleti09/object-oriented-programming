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
}
