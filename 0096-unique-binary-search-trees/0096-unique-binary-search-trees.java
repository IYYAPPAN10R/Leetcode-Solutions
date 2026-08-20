class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int nodes = 2;nodes<=n;nodes++){
            for(int roots = 1;roots<= nodes;roots++){
                dp[nodes] += dp[roots-1] * dp[nodes-roots];
            }
        }
        return dp[n];
    }
}