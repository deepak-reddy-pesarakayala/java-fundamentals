package com.java.oop.array;

public class ArrayCodingQuestion {

    public static int findHighestPrice(int[] productPrices){
        int highest = 0;
        for (int price : productPrices){
            if (price > highest){
                highest = price;
            }
        }
        return highest;
    }

    public static int findSum(int d){
//        int sum = 0;
//        for (int i = 0; i <= 500; i++) {
//            if (i % 10 == d){
//                sum += i;
//            }
//        }
//        return sum;
        int sum = 0;
        int i = 1;
        int count = 0;
        while (count < 50){
            if (i % 10 == d){
                sum += i;
                count++;
            }
            i++;
        }
        return sum;
    }



    public static void main(String[] args) {
        int[] productPrices = {10,20,300,40,50};
//        System.out.println(findHighestPrice(productPrices));
        System.out.println(findSum(1));

    }
}