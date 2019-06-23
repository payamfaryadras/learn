package com.payam.learn.codility.iterations;

public class Asterisks {

    public static void main(String[] args) {
        int n = 3;
        for (int i = n; i > 0; i--) {
            for (int k = 0; k < (n - i); k++)
                System.out.print(" ");
            for (int j = 0; j < (2 * i - 1); j++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
