/**
 * 9. 回文数
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 例如，121 是回文，而 123 不是。
 */

package isPalindrome;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Solution {
    public boolean isPalindrome(int x) {
        char[] chars = Integer.toString(x).toCharArray();
        int rear = chars.length - 1;
        for (int i = 0;i < chars.length; i++){
            if (chars[i] != chars[rear - i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(new Solution().isPalindrome(x));
    }
}
