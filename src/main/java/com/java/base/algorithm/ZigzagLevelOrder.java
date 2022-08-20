package com.java.base.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagLevelOrder {
    //TODO 这个算法还有一点问题，只能通过一半的用例
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> lists = new ArrayList<>();
            if(root == null) return lists;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            List<Integer> root1 = new ArrayList<>();
            root1.add(root.val);
            lists.add(root1);

            boolean isleft =false;
            while(!queue.isEmpty()){
                List<Integer> list = new ArrayList<>();
                TreeNode node = queue.poll();
                if(!isleft){
                    if(node.right != null){
                        queue.add(node.right);
                        list.add(node.right.val);
                    }
                    if(node.left != null){
                        queue.add(node.left);
                        list.add(node.left.val);
                    }
                }
                else{
                    if(node.left != null){
                        queue.add(node.left);
                        list.add(node.left.val);
                    }
                    if(node.right != null){
                        queue.add(node.right);
                        list.add(node.right.val);
                    }
                }
                if(!list.isEmpty()){
                    isleft = !isleft;
                    lists.add(list);
                }

            }
            return lists;
        }
    //  Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}



