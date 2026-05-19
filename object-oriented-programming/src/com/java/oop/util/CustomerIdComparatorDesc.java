package com.java.oop.util;

import com.java.oop.collections.Customer;

import java.util.Comparator;

public class CustomerIdComparatorDesc implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return Integer.compare(o2.id, o1.id);
    }
}