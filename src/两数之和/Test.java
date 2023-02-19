package 两数之和;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++){
            nums[i] = scanner.nextInt();
        }
        int[] target = new Solution().twoSum(nums, 6);
        System.out.println(Arrays.toString(target));
    }
}
