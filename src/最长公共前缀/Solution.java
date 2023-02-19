package 最长公共前缀;

import java.util.Scanner;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        char[] chars = strs[0].toCharArray();
        String prefix = "";
        for (int i = 0; i < chars.length; i++) {
            for (int j = 1; j < strs.length; j++) {
                if(i >= strs[j].length())  // 防止越界
                    return prefix;
                if (chars[i] != strs[j].toCharArray()[i])
                    return prefix;
            }
            prefix = prefix.concat(String.valueOf(chars[i]));
        }
        return prefix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strs = new String[]{"ab", "a"};
        System.out.println(new Solution().longestCommonPrefix(strs));
    }
}
