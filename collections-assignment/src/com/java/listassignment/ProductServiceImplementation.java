package com.java.listassignment;

import com.java.collections.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImplementation implements ProductService {

    private final List<Product> productList = new ArrayList<>();

    @Override
    public void add(Product product) {
        productList.add(product);
        System.out.println("product added successfully");
    }

    @Override
    public Product findProductById(int id) {
        for (Product product : productList) {
            if (product.id == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void findAllProduct() {
        if (productList.isEmpty()) {
            System.out.println("No Product is there");
            return;
        }
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public Product update(Product product) {
        // Implementation logic not fully visible, usually returns null or updated product
        return null;
    }

    @Override
    public boolean delete(Product product) {
        return false;
    }

    @Override
    public void deleteById(int id) {
        Product product = findProductById(id);
        if (product != null) {
            productList.remove(product);
            System.out.println("product removed successfully");
        } else {
            System.out.println("product not found");
        }
    }
}