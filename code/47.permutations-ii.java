class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;
        int count=0;
        for(int i=1;i<n-1;i++){
            leftMax = Integer.MIN_VALUE;
            rightMax = Integer.MIN_VALUE;
            for(int j=0;j<i;j++){
                leftMax = Math.max(leftMax,arr[j]);
            }
            for(int j=i+1;j<n;j++){
                rightMax = Math.max(rightMax,arr[j]);
            }
            int curr =  Math.min(leftMax,rightMax)-arr[i];
            if(curr>0){
                count+=curr;
            }
        }
        return count;
    }
}