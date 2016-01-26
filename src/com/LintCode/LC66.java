package com.LintCode;

import javax.swing.tree.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Administrator on 2016/1/20.
 */
public class LC66 {
    public static ArrayList<Integer> preorderTraversal(TreeNode root)
    {
        Stack<TreeNode>  stack = new Stack<TreeNode>();
        ArrayList<Integer> preorder = new ArrayList<Integer>();
        if (root==null)
            return preorder;
        stack.push(root);
        while (!stack.empty())
        {
            TreeNode node = stack.pop();
            preorder.add(node.val);
            if (node.right != null)
                stack.push(node.right);
            if (node.left !=null)
                stack.push(node.left);

        }
        return preorder;

    }
}
