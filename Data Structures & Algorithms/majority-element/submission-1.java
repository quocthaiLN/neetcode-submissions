class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                if (map.get(nums[i]) + 1 > n/2) {
                    return nums[i];
                }
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        return nums[0];
    }
}