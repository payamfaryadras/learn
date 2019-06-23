package com.payam.learn.codility.iterations;

public class InversionTrinagle {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++)
                System.out.print(" ");
            for (int k = 0; k <= 2*i; k++)
                System.out.print("*");

            System.out.println("");
        }

    }
}
