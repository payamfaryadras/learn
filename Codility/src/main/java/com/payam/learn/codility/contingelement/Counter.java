package com.payam.learn.codility.contingelement;

import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] result = new int[N];
        int base = 0;
        int max = 0;
        for (int k = 0; k < A.length; k++) {
            int X = A[k];

            if (X >= 1 && X <= N) {

                if (result[X - 1] < base) {
                    result[X - 1] = base;
                }
                result[X - 1]++;
                if (max < result[X - 1]) {
                    max = result[X - 1];
                }
            }
            if (X == N + 1) {
                base = max;

            }
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] < base) {
                result[i] = base;
            }
        }
        return result;

    }

}
