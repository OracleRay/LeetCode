package ÅÀÂ¥Ìİ;

/**
 * ¶¯Ì¬¹æ»®
 */
public class Solution {

    public int climbStairs(int n) {
        int[] climbStairsMethods = new int[n + 1];
        climbStairsMethods[0] = 1;
        climbStairsMethods[1] = 1;
        for (int i = 2; i < climbStairsMethods.length; i++)
            climbStairsMethods[i] = climbStairsMethods[i - 1] + climbStairsMethods[i - 2];
        return climbStairsMethods[n];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(45));
    }
}
