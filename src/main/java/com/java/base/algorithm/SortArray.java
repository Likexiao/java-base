package com.java.base.algorithm;

public class SortArray {
    public int[] sortArray(int[] nums) {

    }
    public void quicksort(int[] nums,int l,int r){

    }
    public int partition(int[] nums,int l,int r){
        int pivot =nums[l];
        while(l<r){
            while(l<r && pivot>nums[l]){
                l++;
            }
            nums[l]=nums[r];
            while(l<r && pivot<nums[r]){
                r--;
            }
            nums[r] = nums[l];
        }
        nums[l] = pivot;
        return l;
    }

}
