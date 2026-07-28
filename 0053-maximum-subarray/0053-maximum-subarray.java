class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for(int i= 0;i<nums.length;i++){
            int temp = curr+nums[i];
            if(temp>nums[i]){
                curr = temp;
            }
            else curr = nums[i];
            max = Math.max(max,curr);
        }
        return max;
    }
}