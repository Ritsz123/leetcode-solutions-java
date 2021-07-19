class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2];
        int i = 0; int j = n;
        for(int x = 0;x<nums.length;x++){
            if(x % 2 == 0) {
                ans[x] = nums[i];
                i++;
            }else{
                ans[x] = nums[j];
                j++;
            }
        }
        return ans;
    }
}