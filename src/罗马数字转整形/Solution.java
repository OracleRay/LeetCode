package 罗马数字转整形;

import java.util.Scanner;

/**
 * 罗马数字.txt
 */
public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1) {  // 防止越界
                if (roman(chars[i]) < roman(chars[i + 1]))
                    result -= roman(chars[i]);
                else
                    result += roman(chars[i]);
            }
            else
                result += roman(chars[i]);
        }
        return result;
    }

    public int roman(char aChar) {
        switch (aChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String roman = scanner.next();
        System.out.println(new Solution().romanToInt(roman));
    }
}
