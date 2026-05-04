package com.java.oop;

public class Main {
    public static void main(String[] args) {
        Product product;
        product = new Product();

        product.id = 1;
        product.name = "Redmi Note 10S";
        product.maxRetailPrice = 17500;
        product.rating = 4.5f;
        product.reviewsCount = 3500;
        product.discountPercentage = 17;
        product.isAvailable = true;
        product.company = "Redmi";
        product.category = "Mobile";

//        System.out.println("Id: " + product.id);
//        System.out.println("Name: " + product.name);
//        System.out.println("Maximum Retail Price: " + product.maxRetailPrice);
//        System.out.println("Rating: " + product.rating);
//        System.out.println("Reviews Count: " + product.reviewsCount);
//        System.out.println("Discount Percentage: " + product.discountPercentage);
//        System.out.println("Is Product Available: " + product.isAvailable);
//        System.out.println("Company: " + product.company);
//        System.out.println("Category: " + product.category);

        Product product2;
        product2 = new Product();

        product2.id = 2;
        product2.name = "Dell Inspiron 16";
        product2.maxRetailPrice = 65000;
        product2.rating = 4.7f;
        product2.reviewsCount = 35000;
        product2.discountPercentage = 6;
        product2.isAvailable = true;
        product2.company = "Dell";
        product2.category = "Laptop";

//        System.out.println("Id: " + product2.id);
//        System.out.println("Name: " + product2.name);
//        System.out.println("Maximum Retail Price: " + product2.maxRetailPrice);
//        System.out.println("Rating: " + product2.rating);
//        System.out.println("Reviews Count: " + product2.reviewsCount);
//        System.out.println("Discount Percentage: " + product2.discountPercentage);
//        System.out.println("Is Product Available: " + product2.isAvailable);
//        System.out.println("Company: " + product2.company);
//        System.out.println("Category: " + product2.category);

        Customer customer = new Customer();

        System.out.println(customer.id);
        System.out.println(customer.name);
        System.out.println(customer.gender);
        System.out.println(customer.emailAddress);
        System.out.println(customer.address);
        System.out.println(customer.age);
        System.out.println(customer.mobileNumber);


        Customer customer1 = new Customer(1,"Deepak","Male","pesarakayaladeepakreddy@gmail.com","Hyderabad",(byte)22,9908129796L);

        System.out.println(customer1.id);
        System.out.println(customer1.name);
        System.out.println(customer1.gender);
        System.out.println(customer1.emailAddress);
        System.out.println(customer1.address);
        System.out.println(customer1.age);
        System.out.println(customer1.mobileNumber);
    }
}