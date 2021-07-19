class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> lst = new LinkedList<>();
        
       
        for(int i=0;i<n-2;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                int lo = i+1,hi = n-1;
                int sum = (0 - nums[i]);
                while(lo<hi){
                    int x = nums[lo]+nums[hi];
                    
                    if(x == sum){
                        
                        lst.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                        
                        while(lo<hi && nums[hi]==nums[hi-1]){
                            hi--;
                        }
                        while(lo<hi && nums[lo]==nums[lo+1]){
                            lo++;
                        }
                        lo++;
                        hi--;
                    }
                    else if(x<sum){
                        lo++;
                    }else {
                        hi--;
                    }
                }
            }
        }
        return lst;
    }
}