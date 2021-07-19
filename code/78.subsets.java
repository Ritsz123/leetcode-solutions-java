class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int n = arr.length;
        if(n==0) return false;
        int m = arr[0].length;
        if(m==0) return false;
        boolean flag = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==target){
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}