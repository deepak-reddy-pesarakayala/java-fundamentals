package com.java.oop.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    void service(List<String> list){

    }
    static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        List<Customer> customers = customerService.getCustomers();
        for(Customer customer : customers){
            customerService.displayCustomer(customer);
        }

    }
}