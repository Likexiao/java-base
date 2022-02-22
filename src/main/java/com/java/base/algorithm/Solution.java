package com.java.base.algorithm;

public class Solution {
    public int findKth(int[] a, int n, int K) {
        // write code here
        int[] bigK = new int[K];
        for(int i=0;i<K;i++){
            bigK[i]=-99;
            for(int j=i;j<n;j++){
                if(bigK[i]<a[j]){
                    bigK[i] = a[j];

                }
                if(j==n-1){
                    System.out.println("this circle the biggest is : "+bigK[i]);
                }
            }
        }
        System.out.println("k is :"+bigK[K-1]);
        System.out.println("a[] is");
        return bigK[K-1];
    }

    public static void main(String[] args) {
        int[] a= new int[]{1,3,5,2,2};
        new Solution().findKth(a,5,3);
    }
}
