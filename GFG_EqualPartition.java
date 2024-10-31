class Solution {
    static boolean isSubsetSum(int arr[] , int sum ) {
        int n = arr.length;
        int m = sum;
        boolean dp[][] = new boolean[n+1][m+1];
        for(int i = 0 ; i <= n; i++){
            for(int j = 0; j <= m ; j++){
                if(i == 0){
                    dp[i][j] = false;
                }
                if(j == 0){
                    dp[i][j] = true;
                }
            }
        }
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= m ; j++){
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j- arr[i-1]];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
     return dp[n][m];
        
    }
    static boolean equalPartition(int arr[]) {
        // code here
        int n = arr.length ;
        int sum = 0 ;
        for(int i = 0 ; i < n ; i++){
            sum = sum + arr[i];
        }
        if(sum % 2 != 0) return false;
        return isSubsetSum(arr , sum/2);
    }
}
