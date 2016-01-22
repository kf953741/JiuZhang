package com.LintCode;

/**
 * Created by Administrator on 2016/1/20.
 */
public class LC97 {
    public static int maxDepth(TreeNode root)
    {
        if (root==null)
        {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;

    }
}
