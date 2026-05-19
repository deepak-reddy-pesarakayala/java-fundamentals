package com.java.fundamentals;

public class Primitives {
     static void main() {

        // byte
        byte age;
        byte subject1Marks, subject2Marks, subject3Marks, subject4Marks, subject5Marks;

        age = 120;
        System.out.println("Age: " + age);

        subject1Marks = 12;
        subject2Marks = 23;
        subject3Marks = 45;
        subject4Marks = 80;
        subject5Marks = 90;

        System.out.println("Subject Marks: " + subject1Marks + ", " + subject2Marks + ", "
                + subject3Marks + ", " + subject4Marks + ", " + subject5Marks);

        // short
        short totalMarks = 234;
        short manufacturingYear = 2002;
        short daysInExpiry = 340;

        System.out.println("Total Marks: " + totalMarks
                + ", Manufacturing Year: " + manufacturingYear
                + ", Days in Expiry: " + daysInExpiry);

        // int
        int salary = 50000;
        int bankBalance = 769347;

        System.out.println("Salary: " + salary);
        System.out.println("Bank Balance: " + bankBalance);

        // long
        long population = 6387283;
        long mobileNumber = 7993840092L;

        System.out.println("Population: " + population);
        System.out.println("Mobile Number: " + mobileNumber);
    }
}
