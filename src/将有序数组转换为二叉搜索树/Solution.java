package 将有序数组转换为二叉搜索树;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        return creatSortedBST(nums, 0, nums.length - 1);
    }

    public TreeNode creatSortedBST(int[] nums, int head, int rear) {
        if (head > rear)
            return null;
        int pivot = (head + rear) / 2;
        TreeNode root = new TreeNode(nums[pivot]);
        root.left = creatSortedBST(nums, head, pivot - 1);
        root.right = creatSortedBST(nums, pivot + 1, rear);
        return root;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        TreeNode root = new Solution().sortedArrayToBST(nums);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                System.out.print(node.val + " ");
                queue.offer(node.left);
                queue.offer(node.right);
            } else
                System.out.print("null ");
        }
    }
}
