package com.LintCode;

/**
 * Created by Administrator on 2016/2/1.
 */
public class LC88 {
    public static TreeNode lowestCommonAncestor(TreeNode root,TreeNode A,TreeNode B)
    {
        if (root==null||root==A||root==B)
        {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left,A,B);
        TreeNode right = lowestCommonAncestor(root.right,A,B);

        if (left!=null&&right!=null)
            return root;
        if (left!=null)
            return left;
        if (right!=null)
            return right;
        return null;

    }
}
