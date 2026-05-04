package com.java.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        RegularCustomer regularCustomer = new RegularCustomer(1,"Deepak","Male","pesarakayaladeepakreddy@gmail.com","Hyserabad",(byte)23,9908129796L,50,"Silver");
        PremiumCustomer premiumCustomer = new PremiumCustomer(2,"Mahesh","Male","mahesh@gmail.com","madhapur",(byte)25,9987653645L,0,"Gold");
        Product product = new Product(43,"Lenovo Laptop",50000,4.5f,2357,(byte)18,true,"Lenovo","Laptops");
        int regularCustomerPrice = product.calculateFinalPrice(regularCustomer);
        int premiumCustomerPrice = product.calculateFinalPrice(premiumCustomer);
        System.out.println("Regular Customer Price: " + regularCustomerPrice);
        System.out.println("Premium Customer Price: " + premiumCustomerPrice);
    }
}