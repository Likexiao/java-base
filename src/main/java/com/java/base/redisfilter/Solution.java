package com.java.base.redisfilter;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public int fb(int a){
        if(a == 0) return 0;
        if(a <= 2) return 1;
        else{
            return fb(a-1)+fb(a-2);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fb(2));
    }
}
