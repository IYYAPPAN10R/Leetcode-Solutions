class Solution {
    public int pivotIndex(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            if(leftSum(i,nums) == rightSum(i,nums)){
                    return i;
            }
        }
        return -1;
    }
    public int leftSum(int i , int[] nums){
        int sum = 0;
        for(int j = 0;j<i;j++){
            sum += nums[j];
        }
        return sum;
    }
    public int rightSum(int i,int[] nums){
        int sum = 0;
        for(int j = i+1;j<nums.length;j++){
            sum += nums[j];
        }
        return sum;
    }
}