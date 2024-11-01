public class Solution {
     static int MOD = 1000000007;
    public static int findWays(int num[], int tar) {
         // Your code goes here
         int n = num.length ;
	   int dp[][] = new int[n + 1][tar + 1];

        // Initialize the dp table
            for (int i = 0; i <= n; i++) {
                 dp[i][0] = 1; // There is one way to achieve sum 0 (by choosing no elements)
        }
             for (int j = 1; j <= tar; j++) {
               dp[0][j] = 0; // There are no ways to achieve a positive sum with 0 elements
        }

        // Fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= tar; j++) {
                if (num[i - 1] <= j) {
                    dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - num[i - 1]]) % MOD;
                } else {
                    dp[i][j] = dp[i - 1][j] % MOD;
                }
            }
        }

        return dp[n][tar]; // Return the number of subsets that sum to 'sum'
    
    }
}
