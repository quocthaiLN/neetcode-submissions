class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int[] prefix_product = new int[n];
        Arrays.fill(prefix_product, 1);
        int product = 1;
        for (int i = 0; i < n; i++) {
            prefix_product[i] = product;
            product *= nums[i];
        }

        int[] postfix_product = new int[n];
        Arrays.fill(postfix_product, 1);
        product = 1;
        for (int i = n - 1; i >= 0; i--) {
            postfix_product[i] = product;
            product *= nums[i];
        }

        for (int i = 0; i < n; i++) {
            result[i] = postfix_product[i] * prefix_product[i];
        }
        return result;
    }
}
