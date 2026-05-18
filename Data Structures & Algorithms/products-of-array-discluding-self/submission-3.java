class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] prefix_product = new int[n];
        Arrays.fill(prefix_product, 1);
        int product = 1;
        for (int i = 0; i < n; i++) {
            prefix_product[i] = product;
            product *= nums[i];
        }

        int[] result = new int[n];
        Arrays.fill(result, 1);
        product = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = product * prefix_product[i];
            product *= nums[i];
        }
        return result;
    }
}
