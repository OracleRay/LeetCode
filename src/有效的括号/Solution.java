package 有效的括号;

import java.util.*;

public class Solution {

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Deque<String> stack = new ArrayDeque<>();
        for (char aChar : chars) {
            if (aChar == '(' || aChar == '[' || aChar == '{')  // 是左括号则入栈
                stack.addFirst(String.valueOf(aChar));
            else {
                try {
                    if (stack.getFirst().equals(match(aChar)))
                        stack.removeFirst();
                    else
                        return false;
                } catch (Exception e) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public String match(char c) {
        String s = String.valueOf(c);
        Map<String, String> map = new HashMap<>();
        map.put(")", "(");
        map.put("]", "[");
        map.put("}", "{");
        return map.get(s);
    }

    public static void main(String[] args) {
        String s = "]";
        System.out.println(new Solution().isValid(s));
    }

}
