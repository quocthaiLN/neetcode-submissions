class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        if (n == 1) {
            return false;
        }
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            while (Math.abs(i - j) <= k && j < n) {
                if (nums[i] == nums[j])
                    return true;
                j++;
            }
        }
        return false;
    }
}