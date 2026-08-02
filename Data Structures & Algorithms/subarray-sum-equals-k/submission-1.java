class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSum = new HashMap<>();
        int count = 0;
        int sum = 0;

        prefixSum.put(0, 1); // [prefixSum, freq]
        for (int num : nums) {
            sum += num;
            int pending = sum - k;
            if (prefixSum.containsKey(pending)) {
                count += prefixSum.get(pending);
            }

            prefixSum.put(sum, prefixSum.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}