package com.java.fundamentals;

import java.util.Scanner;

public class InputTest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        byte age = sc.nextByte();
        System.out.println("Age: " + age);
        System.out.println("Enter Marks:");
        short marks = sc.nextShort();
        System.out.println("Marks:" + marks);
        System.out.println("Enter Salary:");
        int salary = sc.nextInt();
        System.out.println("Salary:" + salary);
        System.out.println("Enter Mobile No:");
        long mobileNo = sc.nextLong();
        System.out.println("Mobile no: " + mobileNo);
        System.out.println("Enter your grade");
        char grade = sc.next().charAt(0);
        System.out.println("Enter grade :" + grade);
        System.out.println("Is available  stock true/false");
        boolean isavailablestock = sc.nextBoolean();
        System.out.println("is available stock : " +isavailablestock );
        System.out.println("Enter discount value");
        float discountPercentage = sc.nextFloat();
        System.out.println("the discount value is" + discountPercentage);
        System.out.println("Enter value of present bank balance");
        double bankbalance = sc.nextDouble();
        System.out.println("Available bank balance:" + bankbalance);
        sc.close();
    }
}
