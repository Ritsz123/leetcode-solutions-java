class NumArray {

    int[] arr;
    int[] preSum;
    public NumArray(int[] nums) {
        arr = new int[nums.length];
        preSum = new int[nums.length];
        
        for(int i = 0;i<nums.length;i++){
            arr[i] = nums[i];
            if(i == 0){
                preSum[i] = arr[i];
            }else{
                preSum[i] = preSum[i-1] + arr[i];
            }
        }
    }
    
    public int sumRange(int left, int right) {
        return preSum[right] - preSum[left] + arr[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */