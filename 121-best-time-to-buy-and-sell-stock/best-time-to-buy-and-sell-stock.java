class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int current = prices[0];
        for(int i = 1; i<prices.length; i++){
            if(prices[i]<current)   current = prices[i];
            else    max = Math.max(max, prices[i] - current);
        }
        return max;
    }
}