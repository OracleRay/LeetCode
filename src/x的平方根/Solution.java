package x的平方根;

public class Solution {

    public int mySqrt(int x) {
        long low = 0, high = x;
        while (low <= high) {
            long pivot = (low + high) / 2;
            if (pivot * pivot < x)
                low = pivot + 1;
            else if (pivot * pivot > x)
                high = pivot - 1;
            else
                return (int) pivot;
        }
        return (int) ((low * low == x) ? low : (low - 1));
    }

    public static void main(String[] args) {
        System.out.println(new Solution().mySqrt(2147395599));
    }
}
