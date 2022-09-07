class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for(int i = 0 ; i < prices.length ; i++)
        {
            minPrice = Math.min(prices[i] , minPrice);
            max_profit = Math.max(prices[i] - minPrice , max_profit);
        }
        return max_profit;
    }
}
// TC : O(N)
// SC : O(1)
