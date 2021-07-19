class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        
        Arrays.sort(arr);
        
        Set<ArrayList<Integer>> hs = new HashSet<ArrayList<Integer>>();
        
        find(0,arr,target,new ArrayList<Integer>(),hs);
        return new ArrayList<List<Integer>>(hs);
    }
    
    public void find(int index, int[] arr, int target, ArrayList<Integer> ds, Set<ArrayList<Integer>> set){
        
        if(index == arr.length){
            if(target==0){
                set.add(new ArrayList(ds));
            }
            return;
        }
        if(target==0){
            set.add(new ArrayList(ds));
            return;
        }
        
        if(arr[index]<=target){
            ds.add(arr[index]);
            find(index+1,arr,target-arr[index],ds,set);
            ds.remove(ds.size()-1);
        }
        find(index+1,arr,target,ds,set);
    }
}