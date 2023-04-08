package 杨辉三角;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= numRows;i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 0; j < i - 2; j++) {
                List<Integer> integers = list.get(i - 2);   //上一行的元素
                row.add(integers.get(j) + integers.get(j + 1));
            }
            if (i > 1)
                row.add(1);
            list.add(row);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().generate(10));
    }
}
