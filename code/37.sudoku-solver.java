class Solution {
    public void solveSudoku(char[][] board) {
        if(board.length < 9) return;
        solve(board);
    }
    
    boolean solve(char[][] arr) {
        for(int i=0;i<9;i++){
            for(int j = 0;j<9;j++){
                //empty pos
                if(arr[i][j] == '.') {
                    for(char c = '1'; c <= '9';c++){
                        if(isSafe(arr, i, j, c)){
                            arr[i][j] = c;
                            
                            if(solve(arr)){
                                return true;
                            }else{
                                arr[i][j] = '.';
                            }
                        }
                    }
                    return false;
                } 
            }
        }
        return true;
    }
    
    boolean isSafe(char[][] arr, int i,int j, char ch){
        // vertical
        for(int row = 0; row <9; row++){
            if(arr[row][j] == ch) return false;
        }
        
        // horizontal
        for(int col = 0; col<9;col++){
            if(arr[i][col] == ch) return false;
        }
        
        //box
        for(int row = i - (i % 3); row < i - (i % 3) + 3;row++){
            for(int col = j - (j % 3); col < j - (j % 3) + 3; col++){
                if(arr[row][col] == ch) return false;
            }
        }
        
        return true;
    }
}