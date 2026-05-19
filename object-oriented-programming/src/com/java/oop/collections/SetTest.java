package com.java.oop.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
    public static void main(String[] args) {
        HashSet<Product> productSet = new HashSet<>();
        productSet.add(new Product(111,"product 1",100,4.5f,200,(byte)18,true,"company 1","category 1"));
        productSet.add(new Product(222,"product 2",200,4.5f,200,(byte)18,true,"company 2","category 2"));
        productSet.add(new Product(333,"product 3",300,4.5f,200,(byte)18,true,"company 3","category 3"));
        productSet.add(new Product(444,"product 4",400,4.5f,200,(byte)18,true,"company 4","category 4"));
        productSet.add(new Product(555,"product 5",500,4.5f,200,(byte)18,true,"company 5","category 5"));
        productSet.add(new Product(111,"product 1",100,4.5f,200,(byte)18,true,"company 1","category 1"));
        productSet.add(new Product(222,"product 2",200,4.5f,200,(byte)18,true,"company 2","category 2"));
        productSet.add(new Product(333,"product 3",300,4.5f,200,(byte)18,true,"company 3","category 3"));

        System.out.println(productSet.toString());

        Iterator<Product> iterator = productSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}


