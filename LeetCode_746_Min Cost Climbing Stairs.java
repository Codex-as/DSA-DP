class Solution {
     public int helperMinCost(int[] cost , int i ,int[] dp) {
        if(i == 0 || i == 1) return cost[i];
         if(dp[i] != -1) return dp[i];
         dp[i] =  cost[i] + Math.min(helperMinCost(cost , i-1 , dp) , helperMinCost(cost , i-2 , dp ));
         return dp[i];
     }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp , -1);
        return Math.min(helperMinCost(cost , n-1 , dp) , helperMinCost(cost , n-2 , dp));
    }
}
