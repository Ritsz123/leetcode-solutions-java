class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        
        minCoins(coins, amount, dp);
    
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
    
    int minCoins(int[] coins, int amt, int[] dp){
        if(amt == 0) return 0;
        
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<coins.length;i++){
            if(coins[i] <= amt) {
                
                int sub;
                if(dp[amt-coins[i]] != -1){
                    sub = dp[amt-coins[i]];
                }else{
                    sub = minCoins(coins, amt - coins[i], dp);
                }
                
                if(sub != Integer.MAX_VALUE){
                    min = Math.min(sub + 1, min);    
                }
            }
        }
        return dp[amt] = min;
    }
}