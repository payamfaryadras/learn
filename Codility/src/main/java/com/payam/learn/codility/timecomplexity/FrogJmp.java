package com.payam.learn.codility.timecomplexity;

public class FrogJmp {
    public static void main(String[] args) {
        int X = 10, Y = 85, D = 30;
        int remain =(Y-X)%D;
        int jumppStep =(Y-X)/D;
        if(remain>0){
            jumppStep++;
        }
        System.out.println(jumppStep);
    }
}
