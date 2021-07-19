class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        subsets(nums,0,new ArrayList<Integer>(),ans);
        return new ArrayList(ans);
    }
    
    public void subsets(int [] arr,int index, ArrayList<Integer>ds,HashSet<List<Integer>>ans){
        if(index >= arr.length){
            ans.add(new ArrayList(ds));
            return;
        }
        
        
        ds.add(arr[index]);
        subsets(arr,index+1,ds,ans);
        ds.remove(ds.size()-1);
        
        subsets(arr,index+1,ds,ans);
    }
}