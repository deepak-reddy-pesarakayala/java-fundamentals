package com.java.fundamentals;

import java.util.Scanner;

public class SwitchTest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day: ");
        int day = sc.nextInt();
        switch(day) {
            case 1:
                System.out.println("SundayPlan");
                break;
            case 2:
                System.out.println("MondayPlan");
                break;
            case 3:
                System.out.println("TuesdayPlan");
                break;
            case 4:
                System.out.println("WednesdayPlan");
                break;
            case 5:
                System.out.println("ThursdayPlan");
                break;
            case 6:
                System.out.println("FridayPlan");
                break;
            case 7:
                System.out.println("SaturdayPlan");
                break;
            default:
                System.out.println("InvalidPlan");
                break;
        }
    }
}
