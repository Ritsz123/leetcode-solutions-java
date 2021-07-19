class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[] arr = new int[m];
        for(int i = 0;i<m;i++){
            int c = 0;
            for(int j = 0;j<n;j++){
                if(mat[i][j] == 1){
                    c++;
                }else{
                    break;
                }
            }
            arr[i] = c;
        }
        
        int[] ans = new int[k];
        for(int i = 0;i<k;i++){
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for(int j = 0;j<m;j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIdx = j;
                }
            }
            ans[i] = minIdx;
            arr[minIdx] = Integer.MAX_VALUE;
        }
        return ans;
    }
}