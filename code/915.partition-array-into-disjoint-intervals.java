class Solution {
    public int partitionDisjoint(int[] nums) {
        if(nums.length == 0) return 0;
        
        int highestAtThisPoint = 0;
        for(int i = 0;i<nums.length;i++){
            boolean found = false;
            if(nums[i] > nums[highestAtThisPoint]) {
                highestAtThisPoint = i;
            }
            
            for(int j = i+1;j<nums.length;j++){
                if(nums[j] < nums[highestAtThisPoint]){
                    found = true;
                }
            }
            if(!found) return i+1;
        }
        return nums.length;
    }
}