class Solution {
    static int knapSack(int capacity, int val[], int wt[]) {
        // code here
        int n = wt.length ;
        int m = capacity ;
        int dp[][] = new int[n+1][m+1];
        for(int i = 0 ; i <= n ; i++){
            for(int j = 0 ; j <= m ; j++){
              if( i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
                else if(wt[i-1] <= j) {
                    dp[i][j] = Math.max(val[i-1] + dp[i][j - wt[i-1]] , dp[i-1][j]) ;
                }
                else{
                    dp[i][j] = dp[i-1][j] ;
                }
            }
        }
        return dp[n][m];
    }
}
