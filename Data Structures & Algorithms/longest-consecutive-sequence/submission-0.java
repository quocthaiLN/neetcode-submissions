class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        int max_count = 0;
        for (int i = 0; i < n; i++) {
            if (!set.contains(nums[i] - 1)) {
                int count = 0;
                while (set.contains(nums[i] + count)) {
                    count++;
                }
                if (count > max_count) {
                max_count = count;
            }
            }

        }
        return max_count;
    }
}
