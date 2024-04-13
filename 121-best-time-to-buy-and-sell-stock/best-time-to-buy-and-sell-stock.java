class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = 0;
        int diff = 0;
        for(int i = 0; i<prices.length; i++){
            if(prices[i]<buy)   buy = prices[i];
            sell = (prices[i] - buy);
            if(diff < sell) diff = sell;
        }
        return diff;
    }
}