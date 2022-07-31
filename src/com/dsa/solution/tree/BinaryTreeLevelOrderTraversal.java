package com.dsa.solution.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);

        while (!q.isEmpty()) {
            int len = q.size();
            List<Integer> lst = new ArrayList<Integer>();
            for (int i = 0; i < len; i++) {
                TreeNode firstElement = q.peek();
                if (firstElement.left != null) {
                    q.offer(firstElement.left);
                }
                if (firstElement.right != null) {
                    q.offer(firstElement.right);
                }
                lst.add(q.poll().val);
            }
            res.add(lst);
        }

        return res;

    }
}
