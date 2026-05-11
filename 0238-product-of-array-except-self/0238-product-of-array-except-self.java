class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul =1;
        int z = 0;
        int zm = 1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                z++;
                zm = mul;
                mul *= nums[i];
            }
            else {
            mul *= nums[i];
            zm *= nums[i];
            }

        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0)
            nums[i] = mul/nums[i];
            else if(z == 1){
                nums[i] = zm;
            }
        }
        return nums;
    }
}