class Solution {
    private int count(int[] piles, int n, int k) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += piles[i] / k;
            if (piles[i] % k != 0) {
                count++;
            }
        }
        return count;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length, max = Arrays.stream(piles).max().getAsInt();
        int left = 1, right = max;
        int min_k = max;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (count(piles, n, mid) > h) {
                left = mid + 1;
            } else {
                right = mid - 1;
                if (mid < min_k) {
                    min_k = mid;
                }
            }
        }
        return min_k;
    }
}
