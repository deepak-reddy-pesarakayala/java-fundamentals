package com.java.fundamentals;
import java.util.Scanner;

public class PrintEvenNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range");
        int Range = sc.nextInt();
        int number = 1;
        while (number <= Range) {
            if (number % 2 == 0)
                System.out.println(number);
            number++;
        }
    }
}
