package com.java.oop.inheritance;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    float rating;
    int reviewsCount;
    byte discountPercentage;
    boolean isAvailable;
    String company;
    String category;

    public Product(int id, String name, int maxRetailPrice, float rating, int reviewsCount, byte discountPercentage, boolean isAvailable, String company, String category) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.rating = rating;
        this.reviewsCount = reviewsCount;
        this.discountPercentage = discountPercentage;
        this.isAvailable = isAvailable;
        this.company = company;
        this.category = category;
    }

    public int calculateFinalPrice(RegularCustomer customer){
        int finalPrice = maxRetailPrice - (maxRetailPrice * discountPercentage / 100) + 50;
        return finalPrice;
    }

    public int calculateFinalPrice(PremiumCustomer customer){
        discountPercentage += 20;
        int finalPrice = maxRetailPrice - (maxRetailPrice * discountPercentage / 100);
        return finalPrice;
    }
}