class Solution {
    public int mySqrt(int x) {
        int left = 0, right = x / 2 + 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid <= x && (long) (mid + 1) * (mid + 1) > x)
                return mid;
            else if ((long) mid * mid > x)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }
}