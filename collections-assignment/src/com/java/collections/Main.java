package com.java.listassignment;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductServiceImpl();

        service.add(new Product(1, "shoe", "shoe", 500));
        service.findAllProduct();

        // Lines 8-9 are partially obscured but follow the pattern:
        // service.add(new Product(2, "another", "category", 300));
        // service.findAllProduct();

        System.out.println("Execution finished.");
    }
}