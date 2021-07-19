class Solution {
        
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        find(0,candidates,target,ans,new ArrayList<Integer>());
        
        return ans;
    }
    
    public void find(int index, int[] arr, int target,List<List<Integer>> ans, ArrayList<Integer> ds){
        
        if(index==arr.length){
            if(target==0){
               ans.add(new ArrayList<>(ds));
            }
            return;
        }
        
        if(arr[index]<=target){
            ds.add(arr[index]);
            find(index,arr,target-arr[index],ans,ds);
            ds.remove(ds.size()-1);    
        }
        
        find(index+1,arr,target,ans,ds);
    }
}