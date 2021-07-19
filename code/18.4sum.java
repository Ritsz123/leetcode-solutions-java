class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int minDiff = Integer.MAX_VALUE;
        int ans = 0;
        Arrays.sort(nums);
        for(int i = 0;i<n;i++){
            int x = i+1;
            int y = n-1;
            while(x < y){
                int sum = nums[i] + nums[x] + nums[y];
                int diff = Math.abs(target - sum);
                System.out.println(diff);
                if(diff < minDiff){
                    minDiff = diff;
                    ans = sum;
                }
                
                if(sum < target){
                    x++;
                } else {
                    y--;
                }
            }
        }
        return ans;
    }
}