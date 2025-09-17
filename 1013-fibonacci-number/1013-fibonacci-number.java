class Solution {
    public int dp[];
    public int helper(int n){
        if(n<=1){
            return n;
        }
        
        dp[n] = helper(n-1) + helper(n-2);
        return dp[n];
    }
    public int fib(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n);
    }
}