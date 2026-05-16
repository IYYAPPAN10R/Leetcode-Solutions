class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            total += nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            if(sum == (total-nums[i]-sum)) return i;
            sum += nums[i];

        }
        return -1;
    }
}