package com.java.base.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BitSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Scanner scanner = new Scanner(System.in);
//        int target = scanner.nextInt();
//        System.out.println("目前的位置是："+BitSearch.bitsearch(arr,target));
        System.out.println(Arrays.binarySearch(arr,1));
    }
    public static int bitsearch(int[] arrays,int a)
    {
        int lo = 0;
        int hi = arrays.length-1;
        int mid;
        while (lo<=hi){
            mid = (hi+lo)/2;
            if(a == arrays[mid]){
                return mid+1;
            }
            else if(a>arrays[mid]){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        return -1;
    }

}
