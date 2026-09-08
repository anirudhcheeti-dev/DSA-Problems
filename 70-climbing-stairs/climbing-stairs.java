class Solution {
    public int climbStairs(int n) {
        return bottomup(n);
    }

    // Approach 1: Top-Down (Memoization) 
        private int topdown(int n){
            int[] dp=new int[n+1];
            return helper(dp,n);
        }
        public int helper(int[] dp, int n){
            if(n<=2) return n;
            if(dp[n]!=0) return dp[n];//if we have already seen this value it return it 
            return dp[n]=helper(dp,n-1)+helper(dp,n-2);
        }

    // Approach 2: Bottom-Up (Iterative)
        private int bottomup(int n){
        if(n<=2) return n;
            int prev=1;
            int prev1=2;
            for(int i=3;i<=n;i++){
                int temp=prev+prev1;
                prev=prev1;
                prev1=temp;
            }
        return prev1;
        }
}