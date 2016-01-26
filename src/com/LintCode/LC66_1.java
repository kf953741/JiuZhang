package com.LintCode;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/1/25.
 */
public class LC66_1 {
    public static ArrayList<Integer> preorderTraversal(TreeNode root)
    {
        ArrayList<Integer> result = new ArrayList<>();
        if (root==null)
            return result;

        ArrayList<Integer> left = preorderTraversal(root.left);
        ArrayList<Integer> right = preorderTraversal(root.right);

        result.add(root.val);
        result.addAll(left);
        result.addAll(right);

        return result;
    }
}
