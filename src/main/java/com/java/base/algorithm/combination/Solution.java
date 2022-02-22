package com.java.base.algorithm.combination;

public class Solution {
    public int combination (int r, int n) {
        // write code here
        if(r == n){
            return 1;
        }
        if(r == 1) return n;
        int fenmu = fun(r)*fun(n-r);
        return fun(n)/fenmu;
    }
    public int fun(int n){
        if(n < 2) return 1;
        return n*fun(n-1);
    }
}
