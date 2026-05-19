package com.java.fundamentals;
import java.util.Scanner;

public class PriceCalculator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Price");
        int productprice = sc.nextInt();
        System.out.println("Enter Membership: Branus(B)/Silver(S)/Gold(G)/Diamond(D)");
        char membership = sc.next().charAt(0);
        System.out.println("Central tax : ");
        int centralTax = sc.nextInt();
        System.out.println("Statetax : ");
        int stateTax = sc.nextInt();
        System.out.println("Enter Age");
        byte age = sc.nextByte();
        if (membership == 'D') {
            productprice = (int) (productprice - productprice * 0.50);
        }else if (membership == 'G') {
            productprice = (int) (productprice - productprice * 0.20);
        } else if (membership == 'S') {
            productprice = (int) (productprice - productprice * 0.15);
        }else if (membership == 'B'){
            productprice = (int) (productprice - productprice * 0.10);
    }
    if (age > 65) {
        productprice = (int) (productprice - productprice * 0.25);
    } else if(age <=65 && age >45){
        productprice = (int) (productprice - productprice * 0.15);
    } else if(age <=45 && age >25){
        productprice = (int) (productprice - productprice * 0.05);
    }


        System.out.println(productprice + centralTax + stateTax);
    }

}