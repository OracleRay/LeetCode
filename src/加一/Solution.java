package ¼ÓÒ»;


import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0 ; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else if (digits[i] == 9 && i == 0) {
                int[] otherResults = new int[digits.length + 1];
                otherResults[0] = 1;
                return otherResults;
            } else
                digits[i] = 0;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits1 = new int[]{6,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        int[] digits2 = new int[]{9,9,9};
        System.out.println(Arrays.toString(new Solution().plusOne(digits1)));
    }
}
