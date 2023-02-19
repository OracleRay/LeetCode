package ÏàÍ¬µÄÊ÷;

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

    public void CreateTree(TreeNode root, int[] nodeVal) {
        Queue<TreeNode> queue = new LinkedList<>();
        root.val = nodeVal[0];
        TreeNode node = null, leftChild = null, rightChild = null;
        queue.offer(root);
        for (int depth = 2; !queue.isEmpty() && (2 * (depth + 1) - 1) < nodeVal.length; depth++) {
            for (int j = 2 * (depth - 1) - 1; j < Math.pow(2, depth + 1) && j + 1 < nodeVal.length; j += 2) {
                node = queue.poll();
                if (node != null) {
                    if (nodeVal[j] != -1) {
                        leftChild = new TreeNode(nodeVal[j]);
                        node.left = leftChild;
                        queue.offer(node.left);
                    }
                    if (nodeVal[j + 1] != -1) {
                        rightChild = new TreeNode(nodeVal[j + 1]);
                        node.right = rightChild;
                        queue.offer(node.right);
                    }
                }
            }
        }
    }
}