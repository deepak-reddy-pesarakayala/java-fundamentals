package com.java.listassignment;

import com.java.collections.Product;

public interface ProductService {
    public void add(Product product);
    public Product findProductById(int id);
    void findAllProduct();
    Product update(Product product);
    boolean delete(Product product);
    void deleteById(int id);
}