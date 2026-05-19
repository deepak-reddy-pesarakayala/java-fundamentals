package com.java.oop.arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] ids = new int[5];
        ids[0] = 10;
        ids[1] = 20;
        ids[2] = 30;
        ids[3] = 40;
        ids[4] = 50;
        System.out.println(ids.length);
        System.out.println(ids[2]);

        //index based for loop
        //elements manipulation
        for(int i=0;i<ids.length;i++){
            System.out.println(ids[i]);
        }
        //only for reading and using
        for(int id: ids){
            System.out.println(id);
        }
        //index based
        for(int i=0;i<ids.length;i++){
            ids[i] += 10;
        }
        //add 10 for each ids in the arrays

        for(int id : ids){
            id += 10;
        }

        //print the arrays
        System.out.println("------------------2-----------");
        for(int id : ids){
            System.out.println(id);
        }

        char[] chars = {'a','b','c','d','e'};
        for(char c : chars){
            System.out.println(c);
        }
    }
}