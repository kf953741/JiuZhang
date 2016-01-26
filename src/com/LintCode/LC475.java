package com.LintCode;

/**
 * Created by Administrator on 2016/1/25.
 */
public class LC475 {
    public int maxPathSum2(TreeNode root)
    {
         if (root==null)
         {
             return Integer.MIN_VALUE;
         }
        int left = maxPathSum2(root.left);
        int right= maxPathSum2(root.right);
        return root.val+Math.max(0,Math.max(left,right));

    }
}
