class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int lo = 1;
        int hi  = Integer.MIN_VALUE;
        
        for(int i = 0;i<nums.length;i++){
            hi = Math.max(nums[i], hi);
        }
        
        int ans = -1;
        
        while(lo <= hi){
         
            int mid = (lo + hi)/2;
            
            if(possible(nums, threshold, mid)){
                ans = mid;
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return ans;
    }
    
    boolean possible(int[] arr, int th, int mid){
        int result = 0;
        for(int i = 0;i<arr.length;i++){
            
            if(arr[i] / mid > th) return false;
            
            if(arr[i] % mid == 0){
                result += arr[i] /mid;
            }else{
                result += (arr[i] / mid) + 1;
            }
            
            if(result > th) return false;
        }
        return true;
    }
}