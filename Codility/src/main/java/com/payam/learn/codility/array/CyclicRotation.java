package com.payam.learn.codility.array;

public class CyclicRotation {
    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int k = 2;
        int len = A.length-1;
        for (int key:A){
            System.out.print(key+",");
        }
        System.out.println("");
        for (int j = 0; j < k; j++) {
            int temp =A[0];
            for (int i=0;i<len;i++){
                A[0]=A[i+1];
                A[i+1]=temp;
                temp=A[0];
            }

        }
        for (int key:A){
            System.out.print(key+",");
        }
    }
}
