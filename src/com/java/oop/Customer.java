package com.java.oop;

public class Customer {
    int id;
    String name;
    long mobileNumber;
    char gender;
    int age;


    Customer() {
        System.out.println("Coustomer constructor called");
        id = 122;
        name = "pavan";
        mobileNumber = 9186001234L;
        gender = 'M';
        age = 29;
    }

    public Customer(int id, String name, long mobileNumber, char gender, int age) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.gender = gender;
        this.age = age;


    }



}
