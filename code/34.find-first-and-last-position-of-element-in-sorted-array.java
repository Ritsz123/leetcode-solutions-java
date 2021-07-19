class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length -1;
        
        int minPos = -1;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            
            if(nums[mid] == target){
                minPos = mid;
                hi = mid-1;
            }else if(nums[mid] > target){
                hi = mid-1;
            }else {
                lo = mid+1;
            }
        }
        
        lo = 0;
        hi = nums.length -1;
        int maxPos = -1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(nums[mid] == target){
                maxPos = mid;
                lo = mid+1;
            }else if(nums[mid] > target){
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        
        int[] ans = {minPos, maxPos};
        return ans;
    }
}