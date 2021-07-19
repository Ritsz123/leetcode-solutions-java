class Solution {
    public int maximumWealth(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            int c = 0;
            for(int j = 0;j<arr[0].length;j++){
                c += arr[i][j];
            }
            max = Math.max(c, max);
        }
        return max;
    }
}