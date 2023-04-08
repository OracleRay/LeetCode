package 二叉树的最小深度;

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
        TreeNode root = new TreeNode(nodeVal[0]);
        queue.offer(root);
        int i = 1;
        while (!queue.isEmpty() && i < nodeVal.length) {
            TreeNode node = queue.poll();
            if (nodeVal[i] != -1) {
                node.left = new TreeNode(nodeVal[i]);
                queue.offer(node.left);
            }
            i++;
            if (i < nodeVal.length && nodeVal[i] != -1) {
                node.right = new TreeNode(nodeVal[i]);
                queue.offer(node.right);
            }
            i++;
        }
        return root;
    }
}