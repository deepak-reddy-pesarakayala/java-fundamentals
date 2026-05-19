package com.java.fundamentals;
import java.util.Scanner;
public class LoopTest {
    static void main() {
        int no = 1;
        while (no <= 10) {
            if(no == 5)
                break;
            System.out.println(++no);
            no += 3;
        }
    }
}
