class Solution {
   // static int mod = 1000000007;
    /*  public static int countSubSet(int nums[] , int target){
        int n = nums.length ;
        int m = target ;
        int dp[][] = new int[n+1][m+1];
       
         for(int i = 0 ; i <= n ; i++){
            for(int j = 0 ; j <= m ; j++){
                if(i == 0) {
                    dp[i][j] = 0 ;
                }
                if(j == 0) {
                    dp[i][j] = 1;
                }
            }
         }
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= m ; j++){
                if(nums[i-1] <= j) {
                    dp[i][j] = (dp[i-1][j - nums[i-1]] + dp[i-1][j]) ;
                }
                else{
                    dp[i][j] = dp[i-1][j]  ;
                }
            }
        }
        return dp[n][m];
      }
     int findSum(int[] nums){
        int sum = 0;
        for(int i=0; i< nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
   public int findTargetSumWays(int[] nums, int target) {
          int sumOfArray = findSum(nums);
          if(nums.length == 0) return 0;
         // Check if the partition is possible
        if ((sumOfArray + target)%2 != 0 ||  sumOfArray < Math.abs(target) || sumOfArray + target < 0)
            return 0; // If it's not possible to partition
        

        int tsum = (target + sumOfArray)/2; // Calculate the target subset sum
        return countSubSet(nums, tsum); // Count subsets with the target sum
          
    }

}
