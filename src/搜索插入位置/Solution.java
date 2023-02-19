package À—À˜≤Â»ÎŒª÷√;

public class Solution {

    public int searchInsert(int[] nums, int target) {
        int pivot = 0;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            pivot = (low + high) / 2;
            if (target < nums[pivot])
                high = pivot - 1;
            else if (target > nums[pivot])
                low = pivot + 1;
            else
                return pivot;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        System.out.println(new Solution().searchInsert(nums, 1));
    }
}
