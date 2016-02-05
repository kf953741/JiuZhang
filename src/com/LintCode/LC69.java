package com.LintCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2016/2/1.
 */
public class LC69 {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root)
    {
        ArrayList result = new ArrayList();
        if (root==null)
            return result;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            ArrayList level = new ArrayList();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode head = queue.poll();
                level.add(head.val);
                if (head.left!=null)
                    queue.add(head.left);
                if (head.right!=null)
                    queue.add(head.right);
            }
            result.add(level);
        }
        return result;
    }
}
