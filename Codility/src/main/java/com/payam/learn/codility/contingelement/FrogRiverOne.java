package com.payam.learn.codility.contingelement;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public static void main(String[] args) {
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        //int[] A = {5, 3, 1, 4, 2, 3, 5, 4};

        int X = 5;

        int flag = (X*(X+1)/2);
        int max=0;
        Set<Integer> shortestPath = new HashSet<>();
        for (int j = 0; j < A.length; j++) {
            if (!shortestPath.contains(A[j])) {
                shortestPath.add(A[j]);
                flag-=A[j];
                if(max<j){
                    max = j;
                }
                if(flag==0){
                    System.out.println(max);

                }
            }
        }
        System.out.println(-1);
    }

}
