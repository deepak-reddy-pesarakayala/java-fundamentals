package com.java.oop.util;

import com.java.oop.collections.Customer;

import java.util.Comparator;

public class CustomerNameComparatorDesc implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o2.name.compareTo(o1.name);
    }
}