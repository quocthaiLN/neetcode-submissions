class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0, prefix_sum = 0;
        map.put(prefix_sum, 1);
        for (int i = 0; i < nums.length; i++) {
            prefix_sum += nums[i];
            int require_sum = prefix_sum - k;
            
            if (map.containsKey(require_sum)) {
                count += map.get(require_sum);
            }
            if (!map.containsKey(prefix_sum)) {
                map.put(prefix_sum, 1);
            } else {
                map.put(prefix_sum, map.get(prefix_sum) + 1);
            }
        }
        return count;
    }
}