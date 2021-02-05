class Solution {
    public int maxProfit(int[] prices) {
        
        // Simple One Pass Approach
        // Cleaner version of the Peak Valley Approach
        
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length - 1; i++) {
            
            // If there is an increase in price the next day
            if (prices[i] < prices[i + 1]) {
                
                // buy today and sell tomorrow
                maxProfit += prices[i + 1] - prices[i];
            }
        }
        
        return maxProfit;
    }
}
