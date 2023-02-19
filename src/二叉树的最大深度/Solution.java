package 二叉树的最大深度;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left,right) + 1;
        }
    }

    public static void main(String[] args) {
        int[] nodeVal = new int[]{3,9,20,-1,-1,15,7};
        TreeNode root = new TreeNode();
        new TreeNode().CreateTree(root,nodeVal);
        System.out.println(new Solution().maxDepth(root));
    }
}
