package com.java.base.algorithm;

import java.util.Arrays;

public class InsertA {


    public int[] sort(int[] arr)
    {
        int length = arr.length;
        int predex,current;

        for (int i=1;i<length;i++){
            predex = i-1;
            current = arr[i];
            while (arr[predex] > current && predex >=0){
                arr[predex+1] = arr[predex];
            }

        }

        return arr;
    }
}
