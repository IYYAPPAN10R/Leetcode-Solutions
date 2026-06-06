class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            StringBuilder rowS = new StringBuilder();
            for(int j = 0;j<n;j++){
                rowS.append(grid[i][j]).append('#');
            }
            String row = rowS.toString();
            map.put(row,map.getOrDefault(row,0)+1);
        }
        int result = 0;
        for(int i = 0;i<n;i++){
            StringBuilder colS = new StringBuilder();
            for(int j = 0;j<n;j++){
                colS.append(grid[j][i]).append('#');
            }
            String col = colS.toString();
            result += map.getOrDefault(col,0);
        }
        return result;
    }
}