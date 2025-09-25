class Solution {
    public void solveSudoku(char[][] board) {
         helper(board);
    }
    public boolean helper(char[][] board){
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                if(board[i][j] == '.'){
                    for(char x = '1';x<='9';x++){
                        if(rowcol(board,x,i,j)){
                            board[i][j] = x;
                            if(helper(board)){
                                return true;
                            }
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean rowcol(char[][] board,char x ,int row , int col){
        for(int i = 0;i<9;i++){
            if(board[i][col] == x) return false;
            if(board[row][i] == x) return false;
        }
        int r = (row/3)*3;
        int c = (col/3)*3;
        for(int i = r;i<r+3;i++){
            for(int j = c;j<c+3;j++){
                if(board[i][j] == x){
                    return false;
                }
            }
        }
        return true;
    }
}