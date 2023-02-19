package ÒÆ³ýÔªËØ;

public class Solution {

    public int removeElement(int[] nums, int val) {
        int isVal = 0, notVal = nums.length - 1;
        while (notVal >= 0 && isVal < notVal + 1) {
            if (nums[isVal] != val)
                isVal++;
            else {
                if (nums[notVal] != val) {
                    nums[isVal] = nums[notVal];
                    isVal++;
                }
                notVal--;
            }
        }
        return notVal + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1};
        int numsLength = new Solution().removeElement(nums,1);
        System.out.println(numsLength);
    }

}
