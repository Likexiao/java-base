package com.java.base.algorithm;

import java.util.Arrays;

public class ShellSort {
    public static void inseretSort(int[] arrays) {
        for(int i=1;i<arrays.length;i++){
            int temp = arrays[i];
            int j = i-1;
            while(j>=0 && arrays[j]>temp){
                arrays[j+1] = arrays[j];
                j--;
            }
            arrays[j+1]=temp;
        }
    }


    public static void main(String[] args) {
        int[] arrays = new int[]{5,32,1,42,56,75,454};
        ShellSort.inseretSort(arrays);
        System.out.println(Arrays.toString(arrays));;
    }
}
