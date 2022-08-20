package com.java.base.algorithm;

public class SpinSearch {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(target<nums[i]){
                continue;
            } else if (target == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
