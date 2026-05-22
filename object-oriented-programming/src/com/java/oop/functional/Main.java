package com.java.oop.functional;
public class Main {
    public static void main(String[] args) {
        Greeting greeting = (name) -> name + "Hello, How are you !";
        System.out.println(greeting.greet("John"));
        Calculate calculate = (price,discountPercentage) -> price - ((price * discountPercentage) / 100);
        System.out.println(calculate.finalPrice(10000,10));
    }
}