class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int p=nums[0];
        for(int i=1;i<nums.length;i++){
            if(p==nums[i]){
                return nums[i];
            }
            p=nums[i];
        }
        return p;
    }
}