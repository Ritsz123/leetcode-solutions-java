class Solution {
    public int[][] updateMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] ans = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        
        Queue<Pair> q = new LinkedList<>();
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 0){
                    ans[i][j] = 0;
                    visited[i][j] = true;
                    q.add(new Pair(i, j, 0));
                }
            }
        }
        
        int[] ax = {-1, 1, 0 ,0};
        int[] ay = {0,0, -1, 1};
        
        while(!q.isEmpty()){
            Pair curr = q.remove();
            
            //every adjacent
            for(int p = 0; p<4;p++){
                int x = curr.x + ax[p];
                int y = curr.y + ay[p];
                
                if(x < 0 || x >= n || y < 0 || y >= m || visited[x][y]){
                    continue;
                }
                
               
                    visited[x][y] = true;
                    ans[x][y] = curr.dist + 1;
                    q.add(new Pair(x,y, curr.dist+1));
                
            }
        }
        
        return ans;
        
    }
}

class Pair{
    int x,y,dist;
    Pair(int x, int y, int dist){
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}
