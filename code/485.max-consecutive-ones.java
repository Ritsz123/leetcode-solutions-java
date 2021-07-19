class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        int max=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1) count++;
            else count=0;
            max=  Math.max(count,max);
        }
        return max;
    }
}