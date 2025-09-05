class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int count = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target){
                count = Math.min(count,Math.abs(i-start));
            }
        }
        return count;
    }
}