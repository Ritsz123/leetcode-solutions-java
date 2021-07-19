class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0;i<=n;i++){
            int temp = i;
            int c = 0;
            while(temp > 0){
                if(temp % 2 == 1){
                    c++;
                }
                temp = temp>>1;
            }
            ans[i] = c;
        }
        return ans;
    }
}