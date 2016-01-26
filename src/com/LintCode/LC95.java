package com.LintCode;

/**
 * Created by Administrator on 2016/1/25.
 */
public class LC95 {
    /*
         SOLUTION 3: Use the recursive version2.
     */
    public static boolean isValidBST3(TreeNode root) {
        // Just use the inOrder traversal to solve the problem.
        if (root == null) {
            return true;
        }

        return dfs(root).isBST;
    }

    public static class ReturnType {
        int min;
        int max;
        boolean isBST;
        public ReturnType (int min, int max, boolean isBST) {
            this.min = min;
            this.max = max;
            this.isBST = isBST;
        }
    }

    // BST:
    // 1. Left tree is BST;
    // 2. Right tree is BST;
    // 3. root value is bigger than the max value of left tree and
    // smaller than the min value of the right tree.
    public static ReturnType dfs(TreeNode root) {
        ReturnType ret = new ReturnType(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
        if (root == null) {
            return ret;
        }

        ReturnType left = dfs(root.left);
        ReturnType right = dfs(root.right);

        // determine the left tree and the right tree;
        if (!left.isBST || !right.isBST) {
            ret.isBST = false;
            return ret;
        }

        // 判断Root.left != null是有必要的，如果root.val是MAX 或是MIN value,判断会失误
        if (root.left != null && root.val <= left.max) {
            ret.isBST = false;
            return ret;
        }

        if (root.right != null && root.val >= right.min) {
            ret.isBST = false;
            return ret;
        }

        return new ReturnType(Math.min(root.val, left.min), Math.max(root.val, right.max), true);
    }
}
