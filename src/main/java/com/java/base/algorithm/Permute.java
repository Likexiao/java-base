package com.java.base.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Permute {

    List<List<Integer>> results = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {

        if(nums.length == 0){
            return results;
        }
        System.out.println(results);
        dfs(nums,path,results);
        System.out.println(results);
        return results;
    }
    public void dfs(int[] nums, List<Integer> path,List<List<Integer>> r) {
        if(path.size() == nums.length){
            System.out.println("将list加入result"+path);

            r.add(path);
            System.out.println("result:"+r);
            return;
        }
        for(int i=0;i< nums.length;i++){
            if(path.contains(nums[i])){
                continue;
            }
            path.add(nums[i]);
            dfs(nums,path,r);
            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 0};
        List<List<Integer>> list = new Permute().permute(nums);
    }
}
