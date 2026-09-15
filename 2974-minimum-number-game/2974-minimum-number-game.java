class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = 1;
        while(l<nums.length && r<nums.length){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l += 2;
            r += 2;
        }
        return nums;
    }
}