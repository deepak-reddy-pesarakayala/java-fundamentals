package com.java.listassignment;

import java.util.Scanner;

public class ProductUI {
    private final ProductService service = new ProductServiceImpl();
    private final Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        while (true) {
            System.out.println("\n--- Product Management System ---");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Find Product by ID");
            System.out.println("4. Delete Product by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    service.findAllProduct();
                    break;
                case 3:
                    findProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Category: ");
        String category = scanner.nextLine();
        System.out.print("Enter Max Retail Price: ");
        int price = scanner.nextInt();

        Product product = new Product(id, name, category, price);
        service.add(product);
    }

    private void findProduct() {
        System.out.print("Enter Product ID to search: ");
        int id = scanner.nextInt();
        Product product = service.findProductById(id);
        if (product != null) {
            System.out.println(product);
        } else {
            System.out.println("Product not found!");
        }
    }

    private void deleteProduct() {
        System.out.print("Enter Product ID to delete: ");
        int id = scanner.nextInt();
        service.deleteById(id);
    }
}