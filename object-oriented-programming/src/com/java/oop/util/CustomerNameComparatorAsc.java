package com.java.oop.util;

import com.java.oop.collections.Customer;

import java.util.Comparator;

public class CustomerNameComparatorAsc implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.name.compareTo(o2.name);
    }
}