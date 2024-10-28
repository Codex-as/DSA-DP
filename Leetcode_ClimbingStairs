class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];

        for(int i = 0 ; i <= n ; i++){
            dp[i] = -1;
        }
        return climbStairsHelper(n , dp);
 }

  public int climbStairsHelper(int n , int[] dp){
      if(n == 1 || n == 2) return n ;
      if(dp[n] != -1) return dp[n];
      dp[n] = climbStairsHelper(n-1 , dp) + climbStairsHelper(n-2, dp) ;
      return dp[n];
  } 
}
