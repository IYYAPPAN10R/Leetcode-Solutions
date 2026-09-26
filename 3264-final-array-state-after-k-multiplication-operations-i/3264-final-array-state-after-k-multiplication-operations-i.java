class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int[] temp = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            temp[i] = nums[i]; 
        }
        for(int i = 0;i<k;i++){
            Arrays.sort(temp);
            for(int j = 0;j<nums.length;j++){
                if(temp[0] == nums[j]){
                    nums[j] *= multiplier;
                    temp[0] *= multiplier;
                    break;
                }
            }
        }
        return nums;
    }
}