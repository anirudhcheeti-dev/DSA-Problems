class Solution {
    public int minCostClimbingStairs(int[] cost) {
        return bottomup(cost);
    }
    // Approach 1: Top-Down
    public int topdown(int[] cost){
            int n=cost.length;
            int[] dp=new int[n+1];
            Arrays.fill(dp,-1);
            return helper(dp,n,cost);
    }
    public int helper(int[] dp,int n, int[] cost){
            if(n<=1) return 0;
            if(dp[n]!=-1) return dp[n];
            return dp[n]=Math.min(helper(dp,n-1,cost)+cost[n-1],helper(dp,n-2,cost)+cost[n-2]);
    }
    // Approach 2: Bottom-Up
    public int bottomup(int[] cost){
        int prev1=0;
        int prev2=0;
            for(int i=2;i<=cost.length;i++){
                int temp=Math.min(cost[i-1]+prev1,cost[i-2]+prev2);
                prev2=prev1;
                prev1=temp;
            }
        return prev1;
    }
}