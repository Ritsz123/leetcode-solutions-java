class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int sum1 = 0;
            int sum2 = 0;
            for(int x = 0; x<i;x++){
                sum1 += nums[x];
            }
            for(int x = i+1; x < n;x++){
                sum2 += nums[x];
            }
            
            if(sum1 == sum2){
                return i;
            }
        }
        return -1;
    }
}