package com.payam.learn.codility.prefixsums;

public class PassingCars {
    public static void main(String[] args) {
        int[] A={0,1,0,1,1};
        int len=A.length;
        int countP=0;
        int countQ=0;
        int ways=0;
        for(int i=0;i<len;i++){
            if(A[i]==0){
                if(countQ>0 && i>countQ){
                    ways+=countQ;
                }else{
                    countP++;
                }
            }else{
                if(countP>0 && i>=countP){
                    ways+=countP;
                }else{
                    countQ++;
                }
            }
            if(ways>1000000000)
                System.out.println( -1);
              break;
        }
        System.out.println(ways);
    }
}
