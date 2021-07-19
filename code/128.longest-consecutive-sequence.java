class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        int count=1;
        for(int i=0;i<n;i++){
            if(!hs.contains(nums[i]-1)){
                int x=nums[i];
                int c=1;
                while(hs.contains(x+1)){
                    c++;
                    x++;
                }
                count = Math.max(count,c);
            }
        }
        return count;
    }
}