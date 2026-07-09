class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;

        // if there is only one or no price, then profit is zero
        if(prices.length==0 || prices.length==1)
            return profit;

        int min=prices[0];
        
        for(int i=1; i<prices.length; i++){
            if(prices[i]<min && i!=prices.length-1){
                min=prices[i];
            }
            else if(prices[i]>min){
                if(prices[i] - min > profit){
                    profit = prices[i] - min;
                }    
            }
        }

        return profit;
    }
}
