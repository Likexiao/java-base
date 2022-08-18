package com.java.base.algorithm;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = prices[0];
        for(int i=1;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            max = Math.max(max,prices[i]-min);
        }
        return max;
    }
}
