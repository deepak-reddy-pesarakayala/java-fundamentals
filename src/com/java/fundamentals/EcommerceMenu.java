package com.java.fundamentals;
import java.util.Scanner;

public class EcommerceMenu {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Welcome to E-commerce");
        System.out.println("-------------------------------");
        System.out.println("Menu");
        System.out.println("1.Customer");
        System.out.println("2.Order");
        System.out.println("3.Product");
        System.out.println("Payment");
        System.out.println("Exist");
        System.out.println("Enter your 1-5");
        System.out.println("Enter Your Input: ");
        byte Input = sc.nextByte();
        switch (Input) {
            case 1:
                System.out.println("------------------------");
                System.out.println("Welcome to Customer Section: ");
                System.out.println("------------------------");
                System.out.println("1.SignUp");
                System.out.println("2.Login");
                System.out.println("Enter Your Input1: ");
                byte Input1 = sc.nextByte();
                switch (Input1) {
                    case 1:
                        System.out.println("Customer SignUp Successfully");
                        break;
                    case 2:
                        System.out.println("Customer Login Successfully ");
                        break;
                }
        }
    }
}

