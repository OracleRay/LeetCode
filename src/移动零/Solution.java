package “∆∂Ø¡„;

public class Solution {

    static void moveZeroes(int[] nums) {
        int slow = 0, temp;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,0,1};
        moveZeroes(nums);
        for (int num: nums)
            System.out.println(num);
    }

}
