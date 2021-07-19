class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += weights[i];
        }
        int ans = sum;
        for(int i = 1; i < sum;i++){
            int csum = 0;
            boolean poss = true;
            int dayCount = 1;
            for(int j = 0; j < n; j++){
                if(weights[j] > i){
                    poss = false;
                    break;
                }
                csum += weights[j];
                if(csum > i) {
                   dayCount++;
                    csum = weights[j];
                }
                if(dayCount > days){
                    poss = false;
                    break;
                }
            }
            if(poss) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}