package com.java.oop.collections;

import java.util.Objects;

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


    public Product(int id, String name, int maxRetailPrice, float rating, int reviewsCount, byte discountPercentage, boolean isAvailable, String category, String company) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.rating = rating;
        this.reviewsCount = reviewsCount;
        this.discountPercentage = discountPercentage;
        this.isAvailable = isAvailable;
        this.category = category;
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && maxRetailPrice == product.maxRetailPrice && Float.compare(rating, product.rating) == 0 && reviewsCount == product.reviewsCount && discountPercentage == product.discountPercentage && isAvailable == product.isAvailable && Objects.equals(name, product.name) && Objects.equals(company, product.company) && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, maxRetailPrice, rating, reviewsCount, discountPercentage, isAvailable, company, category);
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", maxRetailPrice=" + maxRetailPrice +
                ", rating=" + rating +
                ", reviewsCount=" + reviewsCount +
                ", discountPercentage=" + discountPercentage +
                ", isAvailable=" + isAvailable +
                ", company='" + company + '\'' +
                '}';
    }
}
