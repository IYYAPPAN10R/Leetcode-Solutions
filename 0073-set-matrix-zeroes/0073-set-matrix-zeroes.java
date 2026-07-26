class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] visited = new int[row][col];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0 && visited[i][j] == 0){
                    helper(i ,j,matrix , visited);
                    visited[i][j] = 1;
                }
            }
        }
    }
    public void helper(int i , int j ,int[][] matrix, int[][] visited){
       for(int row = 0;row<matrix[0].length;row++){
            if(visited[i][row] != 1 && matrix[i][row] != 0){
                visited[i][row] = 1;
                matrix[i][row] = 0;
            }
       }
       for(int col = 0;col<matrix.length;col++){
            if(visited[col][j] != 1 && matrix[col][j] != 0){
                visited[col][j] = 1;
                matrix[col][j] = 0;
            }
       }
    }
}