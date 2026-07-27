class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        List<List<Integer>> z = new ArrayList<>();
        int r = mat.length;
        int c = mat[0].length;
        for(int i = 0;i<r+c-1;i++){
            z.add(new ArrayList<>());
        }
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                z.get(i+j).add(mat[i][j]);
            }
        }
        int[] res = new int[r*c];
        int ind = 0;
        for(int i = 0;i<r+c-1;i++){
            List<Integer> temp = z.get(i);
            if(i%2 == 0){ 
                for(int j = temp.size()-1;j>=0;j--){
                    res[ind] = temp.get(j);
                    ind++;
                }
            }
            else{
                for(int j = 0;j<temp.size();j++){
                    res[ind] = temp.get(j);
                    ind++;
                }
            }

        }
        return res;
    }
}