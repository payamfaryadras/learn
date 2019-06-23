package com.payam.learn.codility.timecomplexity;

public class PermMissingElem {
    public static void main(String[] args) {
        int realSum = 0, expectSum = 0;
        int A[] = new int[4];
        A[0] = 2;
        A[1] = 3;
        A[2] = 1;
        A[3] = 5;
        int len = A.length;
        int i = 0;
        while (i <= len) {
            if (i < len)
                realSum += A[i];
            expectSum += i + 1;
            i++;
        }
        System.out.println(expectSum - realSum);
    }
}
