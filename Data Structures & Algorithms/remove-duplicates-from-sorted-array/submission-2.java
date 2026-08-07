class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        for (int r = l + 1; r < nums.length; r++) {
            if (nums[l] != nums[r]) {
                l++;
                nums[l] = nums[r];
            }
        }
        return l + 1;
    }
}