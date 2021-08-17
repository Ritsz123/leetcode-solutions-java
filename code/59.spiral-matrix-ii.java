class Solution {
    public int[][] generateMatrix(int n) {
        int x = 1;
        int[][] arr = new int[n][n];
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        
        while(left <= right && top <= bottom){
            for(int i = left;i <= right;i++){
                arr[top][i] = x++;
            }
            top++;
            
            for(int j = top; j <= bottom;j++){
                arr[j][right] = x++;
            }
            right--;
            
            if(top <= bottom){
                for(int i = right; i>= left;i--){
                    arr[bottom][i] = x++;
                }
                bottom--;
            }
            
            if(left <= right){
                for(int j = bottom; j>=top;j--){
                    arr[j][left] = x++;
                }
                left++;
            }
        }
        return arr;
    }
}