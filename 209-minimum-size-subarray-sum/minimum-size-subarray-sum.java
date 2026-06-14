class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int min=Integer.MAX_VALUE;
        int res=0;
        int i=0;
        while(i<nums.length){
            //int res=nums[left];
            res+=nums[i];
            while(res>=target){
                int win=(i-left+1);
                min=Math.min(min,win);
                res=res-nums[left];
                left++;
            }
            i++;
        }
        if(min==Integer.MAX_VALUE) return 0;
        return min;
    }
}