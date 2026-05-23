class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length, left = 0;
        int max_profit = 0;
        for (int right = 0; right < n; right++) {
            int profit = prices[right] - prices[left];
            if (profit > max_profit) {
                max_profit = profit;
            }
            if(prices[right] < prices[left]){
                left = right;
            }
        }
        return max_profit;
    }
}
