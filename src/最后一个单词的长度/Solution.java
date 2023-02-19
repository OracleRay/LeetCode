package 最后一个单词的长度;

public class Solution {

    public int lengthOfLastWord(String s) {
        int lengthOfWord = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ')
                lengthOfWord++;
            else {  // 如果chars[i]是 ' ' , 那么判断它后面是否还有不是 ' ' 的元素。
                int j = i + 1;
                while (j < chars.length){
                    i = j - 1;
                    if (chars[j] != ' ') {
                        lengthOfWord = 0;  // 说明没有到尽头，初始化单词长度
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
