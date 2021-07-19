class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int n= arr.length;
        if(n==0) return false;
        int m = arr[0].length;
        if(m==0) return false;
        int i=0; int j = m-1;
        while(i<n && j>=0){
            if(arr[i][j]==target) return true;
            if(target<arr[i][j]){
                j--;
            }else i++;
        }
        return false;
    }
}