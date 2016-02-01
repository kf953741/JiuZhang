package com.LintCode;

public class Main {

    public static void main(String[] args)
    {
        //System.out.println(LC16.strStr("abc","bc"));
        //System.out.println(LC14.binarySearch(new int[]{3,4,5,8,8,8,8,10,13,14},8));
        //System.out.println(LC75.findPeak(new int[]{1,2,1,3,4,5,7,6}));
        //System.out.print(LC94.maxPathSum(root);
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        System.out.print(LC88.lowestCommonAncestor(root,root.right.right,root.right));
    }



}
