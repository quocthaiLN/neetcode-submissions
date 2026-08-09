class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        if (n == 1)
            return false;
        for (int right = n - 1; right > 0; right--) {
            int left = right - 1;
            while (Math.abs(left - right) <= k && left >= 0) {
                if (nums[left] == nums[right])
                    return true;
                left--;
            }
        }
        return false;
    }
}