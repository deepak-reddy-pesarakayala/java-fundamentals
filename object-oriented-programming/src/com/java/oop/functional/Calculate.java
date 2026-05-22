package com.java.oop.functional;
@FunctionalInterface
public interface Calculate {
    // int sum(int a, int b);
    double finalPrice(double price, float discountPercentage);
}