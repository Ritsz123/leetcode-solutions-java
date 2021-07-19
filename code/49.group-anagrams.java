class Solution {
    public void rotate(int[][] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int t = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=t;
            }
        }
        for(int i=0;i<n;i++){
            int j=n-1;
            int k=0;
            while(k<j){
                int temp = arr[i][k];
                arr[i][k]=arr[i][j];
                arr[i][j]=temp;
                k++;
                j--;
            }
        }
    }
}