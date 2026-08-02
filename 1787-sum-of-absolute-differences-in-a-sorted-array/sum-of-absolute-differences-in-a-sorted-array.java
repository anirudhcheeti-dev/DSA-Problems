class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int[] postfix=new int[n];
        postfix[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            postfix[i]=postfix[i+1]+nums[i];
        }
        int[] res=new int[n];
        int total=0;
        for(int i=0;i<res.length;i++){
            int left=i;
            int leftsum = (i > 0) ? prefix[i - 1] : 0;
            int leftdiff=(nums[i]*left)-leftsum;

            int right=n-i-1;
            int rightsum=(i<n-1) ? postfix[i+1] : 0;
            int rightdiff=rightsum-(right*nums[i]);

            total=leftdiff+rightdiff;
            res[i]=total;
        }
        return res;
    }
}