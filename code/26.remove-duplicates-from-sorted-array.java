class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        int c = 0;
        for(int i=1;i<n-c;){
            if(nums[i-1]==nums[i]){
                c++;
                for(int j=i;j<n;j++){
                    nums[j-1] = nums[j];
                }
            }else{
                i++;
            }
        }
        return n-c;
    }
}