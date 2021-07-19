class Solution {
    public int numIslands(char[][] grid) {
        
        int count = 0;
        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j< grid[0].length;j++){
                if(grid[i][j] == '1'){
                    bfs(grid, i,j); 
                    count++;
                }
            }
        }
        return count;
    }
    
    void bfs(char[][] grid, int i, int j){
        int n = grid.length;
        int m = grid[0].length;
        if(i < 0 || i == n || j < 0 || j == m || grid[i][j] == '0') return;
        
        grid[i][j] = '0';
    
        bfs(grid, i+1, j);
        bfs(grid, i-1, j);
        bfs(grid, i, j-1);
        bfs(grid, i, j+1);
    }
}