class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=0;
        int min=0;
        int curmax=nums[0];
        int curmin=nums[0];
        int total=0;
        for(int i:nums){
            max=Math.max(max+i,i);
            curmax=Math.max(max,curmax);

            min=Math.min(min+i,i);
            curmin=Math.min(min,curmin);

            total+=i;
        }
        if(curmax<0) return curmax;
        return Math.max(curmax,total-curmin);
    }
}