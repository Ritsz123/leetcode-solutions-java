class Solution {
    public int uniquePaths(int a, int b) {
        int [][] dp = new int[a][b];
		for(int i=0;i<a;i++) {
			Arrays.fill(dp[i], -1);
		}
		return count(a-1,b-1,dp);
    }
    int count(int a,int b,int[][] dp) {
		if(a==0 || b==0) return 1;
		int c;
		if(dp[a][b]==-1) {
			c = count(a-1,b,dp) + count(a,b-1,dp);
            dp[a][b]=c;
		}else {
			c = dp[a][b];
		}
		return c;
	}
}