class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        return solve(n, dp);
    }
    
    int solve(int n, int[] dp) {
        if(n == 0) return 1;
        
        if(n >= 2) {
            if(dp[n] != -1){
                return dp[n];
            }
            return dp[n] = solve(n-2, dp) + solve(n-1, dp);
        }else{
            return dp[n] = solve(n-1, dp);
        }
    }
}