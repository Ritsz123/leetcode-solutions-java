class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1; k<n;k++){
                    if(nums[i] + nums[j] > nums[k] && nums[j] + nums[k] > nums[i] && nums[i] + nums[k] > nums[j]){
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}