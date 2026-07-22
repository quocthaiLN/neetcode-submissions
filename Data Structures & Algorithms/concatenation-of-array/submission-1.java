class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n * 2];
        for (int i = 0; i <= n / 2; i++) {
            ans[i] = nums[i];
            ans[n - i - 1] = nums[n - i - 1];
            ans[n + i] = nums[i];
            ans[n + n - i - 1] = nums[n - i - 1];
        }
        return ans;
    }
}