class Solution {
    public int maxProfit(int[] prices) {
        int maxP=0;

        // if there is only one or no price, then profit is zero
        if(prices.length==0 || prices.length==1)
            return maxP;

        int minB=prices[0];
        
        for(int i=1; i<prices.length; i++){
            if(prices[i]<minB){
                minB=prices[i];
            }
            else if(prices[i]>minB){
                if(prices[i] - minB > maxP){
                    maxP = prices[i] - minB;
                }    
            }
        }

        return maxP;
    }
}
