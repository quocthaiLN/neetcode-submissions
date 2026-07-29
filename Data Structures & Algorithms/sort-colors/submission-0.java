class Solution {
    public void sortColors(int[] nums) {
        int count[] = new int[3], n = nums.length;
        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
        }
        int j = 0;
        for (int i = 0; i <= 2; i++) {
            for (int k = 0; k < count[i]; k++) {
                nums[j] = i;
                j++;
            }
        }
    }
}