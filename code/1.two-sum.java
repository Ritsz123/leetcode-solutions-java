class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int temp = target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==temp){
                    int [] arr = new int[]{i,j};
                    return arr;
                }
            }
        }
        return new int[] {};
    }
}