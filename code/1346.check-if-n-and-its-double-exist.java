class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0;i<arr.length;i++) {
            if(hs.contains(2 * arr[i]) || (arr[i] % 2==0 && hs.contains(arr[i]/2))){
                return true;
            }
            hs.add(arr[i]);
        }
        return false;
    }
}