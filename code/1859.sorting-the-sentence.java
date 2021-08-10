class Solution {
    public int sumOfUnique(int[] nums) {
        int[] count = new int[101];
        
        for(int i = 0;i < nums.length;i++){
            count[nums[i]]++;
        }
        
        int sum = 0;
        for(int i = 0;i <= 100;i++){
            if(count[i] == 1){
                sum += i;
            }
        }
        return sum;
    }
}