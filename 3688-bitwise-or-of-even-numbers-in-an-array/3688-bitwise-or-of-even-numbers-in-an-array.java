class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int sum = 0;
        for(int n : nums){
            if(n%2 == 0){
                sum = sum | n;
            }
        }
        return sum;
    }
}