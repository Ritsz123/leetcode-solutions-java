class Solution {
    public void moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        int x = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != 0){
                arr[x++] = nums[i];
            }
        }
        
        for(int i = 0;i<nums.length;i++){
            if(arr[i] != 0){
                nums[i] = arr[i];
                x = i;
            }else{
                break;
            }
        }
        
        for(int j = x+1;j<nums.length;j++){
            nums[j] = 0;
        }
    }
}