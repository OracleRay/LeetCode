package Æ½ºâ¶þ²æÊ÷;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        return treeHeight(root) >= 0;
    }

    public int treeHeight(TreeNode root) {
        if (root == null)
            return 0;
        int left = treeHeight(root.left);
        int right = treeHeight(root.right);
        if (Math.abs(left - right) >= 2 || left == -1 || right == -1)
            return -1;
        else
            return Math.max(left,right) + 1;
    }

    public static void main(String[] args) {
        int[] treeNode = new int[]{1,2,2,3,-1,-1,3,4,-1,-1,4};
        TreeNode root = new TreeNode().CreateTree(treeNode);
        System.out.println(new Solution().isBalanced(root));
        System.out.println(Math.abs(new Solution().treeHeight(root.left.left) - new Solution().treeHeight(root.left.right)));
    }
}
