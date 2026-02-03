class Solution {
    public boolean isTrionic(int[] nums) {
        int i = 1;
         while(i<nums.length && nums[i]>nums[i-1]){
            i++;
         }
         int p = i-1;
         while(i<nums.length && nums[i]<nums[i-1]){
            i++;
         }
         int q = i-1;
         while(i<nums.length && nums[i]>nums[i-1]){
            i++;
         }
         int f = i-1;
         return (p != 0) && (p != q) && (f != q && f == nums.length-1 );
    }
}