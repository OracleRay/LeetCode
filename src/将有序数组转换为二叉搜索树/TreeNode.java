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
        int nodeIndex = 1, childDepth = 2;
        while (!queue.isEmpty()) {
            node = queue.poll();
            while (nodeIndex < Math.pow(2, childDepth) - 1 && nodeIndex < nodeVal.length) {
                if (node != null) {
                    if (nodeVal[nodeIndex] != -1) {
                        leftChild = new TreeNode(nodeVal[nodeIndex]);
                        node.left = leftChild;
                        queue.offer(node.left);
                    }
                    if (nodeVal[nodeIndex + 1] != -1) {
                        rightChild = new TreeNode(nodeVal[nodeIndex + 1]);
                        node.right = rightChild;
                        queue.offer(node.right);
                    }
                }
                nodeIndex += 2;
            }
            childDepth++;
        }
    }
}