class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        int total=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else{
                if(prices[i]-min>max){
                    total+= prices[i] - min;
                    min= prices[i];
                }
            }
        }
        return total;
    }
}