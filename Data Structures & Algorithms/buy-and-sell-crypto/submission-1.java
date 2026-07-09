class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int min_pos=0;
        int profit=0;

        // if there is only one or no price, then profit is zero
        if(prices.length==0 || prices.length==1)
            return profit;

        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[j]-prices[i] > profit){
                    profit = prices[j]-prices[i];
                }
            }
        }
        
        return profit;
    }
}
