package com.java.base.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s){
        Set<Character> set = new HashSet<>();
        int right = -1,ans = 0;
        for (int i=0;i<s.length();i++){
            if(i !=0){
                set.remove(s.charAt(i-1));
            }
            while(right+1<s.length() && !set.contains(s.charAt(right+1))){
                set.add(s.charAt(right+1));
                right++;
            }
            ans = Math.max(ans,right-i+1);
        }
        System.out.println("长度为"+ans);
        System.out.println("字符为："+s.substring(right-ans-1,right-1));

        return ans;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        new LengthOfLongestSubstring().lengthOfLongestSubstring(s);
    }
}
