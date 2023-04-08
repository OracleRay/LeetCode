package ����������С���;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();    // ��ȡ��ǰ��Ľڵ���
            for (int i = 0; i < size; i++) {          //ֻ�ڵ�ǰ��ѭ��
                TreeNode node = queue.poll();
                assert node != null;
                if (node.left == null && node.right == null)
                    return count;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] treeNode = new int[]{1,2,3,4,5};
        TreeNode root = new TreeNode().CreateTree(treeNode);
        System.out.println(new Solution().minDepth(root));
    }
}
