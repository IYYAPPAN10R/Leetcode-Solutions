class Solution {
    public int heightChecker(int[] height) {

        int[] expected = new int[height.length];
        for(int i = 0;i<height.length;i++){
            expected[i] = height[i];
        }
        Arrays.sort(expected);
        int count =0;
        for(int i = 0;i<height.length;i++){
            if(height[i] != expected[i]){
                count++;
            }
        }
        return count;
    }
}