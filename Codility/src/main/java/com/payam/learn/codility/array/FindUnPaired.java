package com.payam.learn.codility.array;


import java.util.HashMap;


public class FindUnPaired {
    public static void main(String[] args) {
        int[] a = {3, 9, 3, 7, 9, 9, 9};
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i]) && map.get(a[i])==1 ) {
                map.remove(a[i]);
            } else {
                map.put(a[i],1);
            }
        }
        for (int k : map.keySet()) {
            System.out.println(k);
        }

    }


}
