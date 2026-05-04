package com.java.oop.inheritance;

public class Customer {
    int id;
    String name;
    String gender;
    String emailAddress;
    String address;
    byte age;
    long mobileNumber;

    public Customer(int id, String name, String gender, String emailAddress, String address, byte age, long mobileNumber) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.emailAddress = emailAddress;
        this.address = address;
        this.age = age;
        this.mobileNumber = mobileNumber;
    }

    public void displayDetails(){
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNumber);
    }
}