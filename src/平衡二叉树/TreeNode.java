package Æ½ºâ¶þ²æÊ÷;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode CreateTree(int[] nodeVal) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode();
        queue.offer(root);
        int i = 0;
        while (!queue.isEmpty() && i < nodeVal.length) {
            TreeNode node = queue.poll();
            if (nodeVal[i] != -1) {
                node.val = nodeVal[i];
                node.left = new TreeNode();
                node.right = new TreeNode();
                queue.offer(node.left);
                queue.offer(node.right);
            }
            i++;
        }
        return root;
    }
}