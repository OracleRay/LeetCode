package ʢ���ˮ������;

public class Solution {

    static int maxArea(int[] height) {
        int area, maxArea = 0;
        for (int left = 0, right = height.length - 1; left < right; ) {
            area = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, area);
            if (height[left] < height[right])
                for (int tempIndex = left; left < right; left++) {          //���ұ߱��Լ����
                    if (height[left] > height[tempIndex])
                        break;
                }
            else
                for (int tempIndex = right; left < right; right--) {       //����߱��Լ����
                    if (height[right] > height[tempIndex])
                        break;
                }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
