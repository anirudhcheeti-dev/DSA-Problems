class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];//for memorization
        Arrays.fill(dp,-1);//some might have 0 hence we fill -1
        return helper(dp,nums,n-1);
    }
    public int helper(int[]dp,int[] nums,int n){
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];//if already found then we return directly
        return dp[n]=Math.max(helper(dp,nums,n-1),helper(dp,nums,n-2)+nums[n]);//here we check if we should take the current value or skip and take the next value.
    }
}