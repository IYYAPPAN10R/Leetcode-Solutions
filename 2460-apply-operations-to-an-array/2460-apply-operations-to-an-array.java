class Solution {
    public int[] applyOperations(int[] nums) {
        int left = 0;
        int right = 1;
        while(left < nums.length && right < nums.length){
            if(nums[left] == nums[right]){
                nums[left] = nums[left]*2;
                nums[right] = 0;
            }
            left++;
            right++;
        }
        int z = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[z];
                nums[z] = temp;
                z++;
            }
        }
        return nums;
    }
}