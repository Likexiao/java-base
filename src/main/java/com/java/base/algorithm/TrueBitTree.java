package com.java.base.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TrueBitTree {
    public static void main(String[] args)   {

        int[] array=new int[] {0,14,2,3,4,5,6,7,8,9,10,11,12,13};
        TreeNode root=Tool.createTree(array);
        Print.PrintTreeNode(root);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Tool{
    /* * 构建完全二叉树 */
    public static TreeNode createTree(int[] array){
        List<TreeNode> nodeList=new LinkedList<TreeNode>();

        for(int nodeIndex=0;nodeIndex<array.length;nodeIndex++){
            nodeList.add(new TreeNode(array[nodeIndex]));
        }
        for(int parentIndex=0;parentIndex<=array.length/2-1;parentIndex++){
            nodeList.get(parentIndex).left =nodeList.get(parentIndex*2+1);
            //防止是非完全二叉树
            if((parentIndex*2+2)<array.length) {
                nodeList.get(parentIndex).right = nodeList.get(parentIndex * 2 + 2);
            }
        }
        return nodeList.get(0);
    }
}
class Print{
    //打印TreeNode
    public static void PrintTreeNode(TreeNode root){
        ArrayList arrayList=PrintFromTopToBottom(root);
        printTree(arrayList,arrayList.size());
    }
    //转换TreeNode为ArrayList
    private static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        ArrayList<Integer> list = new ArrayList();
        if(root == null)
            return list;

        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            list.add(treeNode.val);
            if(treeNode.left != null)
                queue.offer(treeNode.left);
            if(treeNode.right != null)
                queue.offer(treeNode.right);
        }

        return list;
    }

    //以树形打印ArrayList
    private static void printTree(ArrayList array,int len){

        int layers = (int)Math.floor(Math.log((double)len)/Math.log((double)2))+1;  //树的层数
        int maxWidth = (int)Math.pow(2,layers)-1;  //树的最大宽度
        int endSpacing = maxWidth;
        int spacing;
        int numberOfThisLayer;
        for(int i=1;i<=layers;i++){  //从第一层开始，逐层打印
            endSpacing = endSpacing/2;  //每层打印之前需要打印的空格数
            spacing = 2*endSpacing+1;  //元素之间应该打印的空格数
            numberOfThisLayer = (int)Math.pow(2, i-1);  //该层要打印的元素总数

            int j;
            for(j=0;j<endSpacing;j++){
                System.out.print("  ");
            }

            int beginIndex = (int)Math.pow(2,i-1)-1;  //该层第一个元素对应的数组下标
            for(j=1;j<=numberOfThisLayer;j++){
                System.out.print(array.get(beginIndex++)+"");
                for(int k=0;k<spacing;k++){  //打印元素之间的空格
                    System.out.print("  ");
                }
                if(beginIndex == len){  //已打印到最后一个元素
                    break;
                }
            }

            System.out.println();
        }
        System.out.println();
    }

}