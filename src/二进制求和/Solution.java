package 二进制求和;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public String addBinary(String a, String b) {
        char[] strA = a.toCharArray();
        char[] strB = b.toCharArray();
        Deque<String> stack = new ArrayDeque<>();
        int i = strA.length - 1;
        int j = strB.length - 1;
        boolean jinWei = false;
        while (i >= 0 && j >= 0) {
            if (strA[i] == strB[j] && !jinWei) {             // 两个二进制位相等，且没有进位
                if (strA[i] == '1')
                    jinWei = true;
                stack.addFirst("0");
            } else if (strA[i] == strB[j] && jinWei) {      // 两个二进制位相等，且发生进位
                if (strA[i] == '0')
                    jinWei = false;
                stack.addFirst("1");
            } else if (strA[i] != strB[j] && jinWei)        // 两个二进制位不相等，且发生进位
                stack.addFirst("0");
            else if (strA[i] != strB[j] && !jinWei)         // 两个二进制位不相等，且没有进位
                stack.addFirst("1");
            if (strA[i] == strB[j] && strB[j]== '1' && (i == 0 && j == 0)) {       // 如果两个数位数相等，且是首位进位，则再加一个1
                stack.addFirst("1");
                jinWei = false;
            }
            i--;
            j--;
        }

        // 处理两个二进制位数不相等的情况
        if (i != -1)
            surplusBinary(i, jinWei, strA, stack);
        else if (j != -1)
            surplusBinary(j, jinWei, strB, stack);

        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()) {
            try {
                str.append(stack.removeFirst());
            } catch (Exception e) {
                break;
            }
        }
        return str.toString();
    }

    /**
     * 处理多出来的二进制位数
     * @param p
     * @param jinWei
     * @param chars
     * @param stack
     */
    public void surplusBinary(int p, boolean jinWei, char[] chars, Deque<String> stack) {
        while (p >= 0) {
            if (chars[p] == '1' && jinWei)
                stack.addFirst("0");
            else if (chars[p] == '0' && jinWei) {
                stack.addFirst("1");
                jinWei = false;
            } else
                stack.addFirst(String.valueOf(chars[p]));
            p--;
        }
        if (jinWei)               // 最后还有进位发生，再在前面加一
            stack.addFirst("1");
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(new Solution().addBinary(a, b));
    }
}
