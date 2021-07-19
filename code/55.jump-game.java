class Solution {
    public boolean canJump(int[] nums) {
        boolean[] blockedPos = new boolean[nums.length];
        
        return maxJump(nums, 0,blockedPos);
    }
    
    boolean maxJump(int[] arr, int currentIndex, boolean[] blockedPos){
        if(currentIndex >= arr.length-1){
            return true;
        }
        
        if(blockedPos[currentIndex]) return false;
        
        int curr = arr[currentIndex];
        for(int i = 1; i<= curr;i++) {
            if(maxJump(arr, currentIndex + i, blockedPos)) return true;
            else {
                blockedPos[currentIndex + i ] = true;
            }
        }
        return false;
    }
}