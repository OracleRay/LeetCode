/**
 * 9. ������
 * ����һ������ x ����� x ��һ���������������� true �����򣬷��� false ��
 * ��������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
 * ���磬121 �ǻ��ģ��� 123 ���ǡ�
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
