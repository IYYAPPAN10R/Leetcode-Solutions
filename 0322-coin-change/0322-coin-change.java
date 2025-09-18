class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        if(amount < 0){
            return 0;
        }
        
        for(int i = 1;i<=amount;i++){
            dp[i] = Integer.MAX_VALUE;
            for(int n : coins){
                if(i>=n && dp[i-n] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i],1+dp[i-n]);
                }
            }
        }
        if(dp[amount] == Integer.MAX_VALUE){
            return -1;
        }
        return dp[amount];
        
    }
}