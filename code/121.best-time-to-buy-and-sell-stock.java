class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==0) return 0;
        int diff=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(prices[i]<prices[j]){
                    int t = prices[j]-prices[i];
                    if(t>diff){
                        diff = t;
                    }
                }
            }
        }
        return diff;
    }
}