package ���һ�����ʵĳ���;

public class Solution {

    public int lengthOfLastWord(String s) {
        int lengthOfWord = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ')
                lengthOfWord++;
            else {  // ���chars[i]�� ' ' , ��ô�ж��������Ƿ��в��� ' ' ��Ԫ�ء�
                int j = i + 1;
                while (j < chars.length){
                    i = j - 1;
                    if (chars[j] != ' ') {
                        lengthOfWord = 0;  // ˵��û�е���ͷ����ʼ�����ʳ���
                        break;
                    }
                    else
                        j++;
                }
            }
        }
        return lengthOfWord;
    }

    public static void main(String[] args) {
        String s = "m    ";
        System.out.println(new Solution().lengthOfLastWord(s));
    }
}
