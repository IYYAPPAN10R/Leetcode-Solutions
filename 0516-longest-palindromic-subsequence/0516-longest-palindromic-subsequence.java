class Solution {
    int[][] dp;
    public int longestPalindromeSubseq(String s) {
        dp = new int[s.length()][s.length()];
        return solve(s,0,s.length()-1);
    }
    public int  solve(String s,int i , int j){
        if(i == j) return 1;
        if(i>j) return 0;
        if(dp[i][j] != 0) return dp[i][j];
        if(s.charAt(i) == s.charAt(j)){
            dp[i][j] =  2+(solve(s,i+1,j-1));
        }
        else{
            dp[i][j] = Math.max(solve(s,i,j-1),solve(s,i+1,j));
        }
        return dp[i][j];
    }

}