package 合并两个有序数组;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = 0; i < m && j < n; i++) {
            if (nums2[j] < nums1[i]) {
                for (int k = 0; m - k - 1 >= i; k++)      //后移元素
                    nums1[m - k] = nums1[m - k - 1];
                nums1[i] = nums2[j];
                m++;
                j++;
            }
        }
        while (m < nums1.length) {     //处理剩余的全部都大于nums1的nums2中的数
            nums1[m] = nums2[j];
            j++;
            m++;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        new Solution().merge(nums1, 0, nums2, 1);
        for (int num : nums1)
            System.out.println(num);
    }
}
