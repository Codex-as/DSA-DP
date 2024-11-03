class Solution
{
     public static int isSubsetSum(int arr[] , int n , int sum){
          
         boolean dp[][] = new boolean[n+1][sum+1];
         for(int i = 0 ; i <= n ; i++){
             for(int j = 0 ; j <= sum ; j++){
                 if(i == 0) {
                     dp[i][j] = false;
                 }
                 if(j == 0) {
                     dp[i][j] = true;
                 }
             }
         }
         for(int i = 1 ; i <= n ; i++){
             for(int j = 1 ; j <= sum ; j++){
                 if(arr[i-1] <= j) {
                     dp[i][j] = dp[i-1][j] || dp[i-1][j - arr[i-1]] ;
                 }
                 else{
                     dp[i][j] = dp[i-1][j];
                 }
             }
         }
	    int diff = Integer.MAX_VALUE;
	    for(int j = 0 ; j <= sum ; j++){
	        if(dp[n][j]) {
	            diff = Math.min(diff , Math.abs(sum - 2*j));
	        }
	    }
	    return diff;
     }
	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	     int sum = 0 ;
         for(int i = 0 ; i < n ; i++){
             sum += arr[i];
         }
	      return isSubsetSum(arr , n , sum);
	    
	} 
}
