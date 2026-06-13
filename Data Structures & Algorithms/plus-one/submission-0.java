class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int i = n - 1;
        int d = 1;
        while (i >= 0) {
            int sum = digits[i] + d;
            if (sum <= 9) {
                digits[i] = sum;
                d = 0;
            } else {
                digits[i] = 0;
                d = 1;
            }
            i--;
        }
        if (d == 1) {
            int[] res = new int[n + 1];
            res[0] = d;
            System.arraycopy(digits, 0, res, 1, n);
            return res;
        }
        return digits;
    }
}