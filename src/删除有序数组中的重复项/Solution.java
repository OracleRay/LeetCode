package ɾ�����������е��ظ���;


public class Solution {

    public int removeDuplicates(int[] nums) {
        int numsLength = nums.length;
        for (int i = 0; i < numsLength; i++) {
            int buChang = 1;
            if (i + buChang < numsLength) {
                while (nums[i + buChang] == nums[i] && buChang < numsLength - i) {
                    buChang++;
                    if (i + buChang >= numsLength)
                        break;
                }

                buChang -= 1;
                for (int k = 1; i + k + buChang < numsLength; k++) {  // ���Ԫ�ظ���ǰ��Ԫ��
                    nums[i + k] = nums[i + k + buChang];
                }
                numsLength -= buChang;
            }
        }
        return numsLength;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1};
        System.out.println(new Solution().removeDuplicates(nums));
    }

}
