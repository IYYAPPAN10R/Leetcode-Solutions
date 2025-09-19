class Solution {
    public int hello(int[] num){
       if(num.length == 0) return 0;
       if(num.length == 1) return num[0];
       int[] dp = new int[num.length];
       dp[0] = num[0];
       dp[1] = Math.max(dp[0],num[1]);
       for(int i = 2;i<num.length;i++){
         dp[i] = Math.max(dp[i-1],dp[i-2]+num[i]);
       }
       return dp[num.length-1];
    }
    public int rob(int[] nums) {
       int[] dp = new int[nums.length-1];
       int[] dp2 = new int[nums.length-1];
       if(nums.length == 1){
        return nums[0];
       }
       int m1 = hello(Arrays.copyOfRange(nums,0,nums.length-1));
       int m2 = hello(Arrays.copyOfRange(nums,1,nums.length));
       return Math.max(m1,m2);
    }
}