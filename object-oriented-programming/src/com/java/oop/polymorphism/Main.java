package com.java.oop.polymorphism;

import com.java.oop.inheritance.Customer;
import com.java.oop.inheritance.PremiumCustomer;
import com.java.oop.inheritance.RegularCustomer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1,"Raju","Male","raju@gmail.com","Hyderabad",(byte)23,9977553647L);
        RegularCustomer regularCustomer = new RegularCustomer(2,"Rani","Female","rani@gmail.com","Secundrabad",(byte)26,6655748393L,50,"Silver");
        PremiumCustomer premiumCustomer = new PremiumCustomer(3,"Ravi","Male","ravi@gmail.com","MAdhapur",(byte)26,6644883302L,0,"Gold");
        CustomerService customerService = new CustomerService();
        customerService.displayCustomerDetails(customer);
        System.out.println("----------------------------");
        customerService.displayCustomerDetails(regularCustomer);
        System.out.println("----------------------------");
        customerService.displayCustomerDetails(premiumCustomer);
    }
}