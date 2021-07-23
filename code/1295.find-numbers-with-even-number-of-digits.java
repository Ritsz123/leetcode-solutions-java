class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        if(nums.length == 0) return count;
        for(int x: nums){
            int d = 0;
            while(x != 0){
                x = x/10;
                d++;
            }
            if(d%2==0){
                count++;
            }
        }
        return count;
    }
}