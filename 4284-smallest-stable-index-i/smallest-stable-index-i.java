class Solution {
    public int firstStableIndex(int[] nums, int k) {
        //apart from brute force we need to use a different approach
        //use prefix max and suffix min

        int n=nums.length;
        int max=nums[0];
        int min=nums[n-1];

        int[] pre=new int[n];
        int[] suf=new int[n];

        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            pre[i]=max;
            min=Math.min(min,nums[n-i-1]);
            suf[n-i-1]=min;
        }
        
        for(int i=0;i<n;i++){
            if(pre[i]-suf[i]<=k) return i;
        }
        return -1;
    }
}