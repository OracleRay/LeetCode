package 相同的树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 广搜
 */

public class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.offer(p);
        queue2.offer(q);
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            TreeNode node1 = queue1.poll();
            TreeNode node2 = queue2.poll();
            if (node1 != null && node2 != null) {
                if (node1.val != node2.val)
                    return false;
                queue1.offer(node1.left);
                queue1.offer(node1.right);
                queue2.offer(node2.left);
                queue2.offer(node2.right);
            } else if (node1 == null && node2 == null){
                continue;
            } else
                return false;
        }
        return queue1.isEmpty() && queue2.isEmpty();
    }

    public static void main(String[] args) {
        int[] treeNode1 = new int[]{1,2,1};
        int[] treeNode2 = new int[]{1,-1,2};
        TreeNode tree1 = new TreeNode();
        TreeNode tree2 = new TreeNode();
        new TreeNode().CreateTree(treeNode1);
        new TreeNode().CreateTree(treeNode2);
        System.out.println(new Solution().isSameTree(tree1, tree2));
    }
}
