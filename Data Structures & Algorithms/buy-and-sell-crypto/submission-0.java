class Solution {
    public int maxProfit(int[] prices) {
        int r = 0;

        for(int i = 0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
            if(prices[i] < prices[j]){
                if (r < prices[j] - prices[i]){
                    r = prices[j] - prices[i];
                }
            } 
        }
    }

    return r;
        
    }
}
