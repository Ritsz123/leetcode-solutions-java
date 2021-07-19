class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int count;
            if(map.containsKey(nums[i])){
                count = map.get(nums[i])+1;
            }else{
                count=1;
            }
            map.put(nums[i],count);
        }
        // System.out.println(map);
        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>n/3){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}