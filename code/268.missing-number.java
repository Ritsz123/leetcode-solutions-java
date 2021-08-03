class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        
        int x = 0;
        while(!hs.isEmpty()){
            if(hs.contains(x)){
                hs.remove(x);
                x++;
            }else{
                return x;
            }
        }
        return x;
    }
}