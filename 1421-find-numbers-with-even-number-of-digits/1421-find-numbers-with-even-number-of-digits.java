class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int n : nums){
            String a = String.valueOf(n);
            if(a.length()%2 == 0){
                count++;
            }
        }
        return count;
    }
}