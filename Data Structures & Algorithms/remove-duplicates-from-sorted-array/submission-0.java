class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length, k = 0;
        int res[] = new int[n];
        if (n != 0) {
            res[0] = nums[0];
            k++;
        } else {
            return k;
        }
        for (int i = 1; i < n; i++) {
            if (nums[i] == res[k - 1]) {
                continue;
            }
            res[k] = nums[i];
            k++;
        }

        for (int i = 0; i < k; i++) {
            nums[i] = res[i];
        }

        return k;
    }
}