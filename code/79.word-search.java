class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        
        boolean[][] visited = new boolean[n][m];
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(!visited[i][j] && board[i][j] == word.charAt(0) && dfs(board, i,j, 0, word, visited)){
                    return true;
                } 
            }
        }
        return false;
    }
    
    boolean dfs(char[][] board, int i, int j, int count, String word, boolean [][] visited) {
        
        int n = board.length;
        int m = board[0].length;
        
        if(count == word.length()) return true;
        
        if(i < 0 || i >= n || j < 0 || j >= m || visited[i][j] || word.charAt(count) != board[i][j]){
            return false;
        }
        
        visited[i][j] = true;
        
        int[] row = {-1, 0, 0, 1};
        int[] col = {0, -1, 1, 0};
        
        for(int x = 0; x<4;x++){
            if(dfs(board, i + row[x], j + col[x], count + 1, word, visited)){
                return true;
            }
        }
        
        //mark unvisited as solution not possible from this point
        visited[i][j] = false;
        return false;
    }
}