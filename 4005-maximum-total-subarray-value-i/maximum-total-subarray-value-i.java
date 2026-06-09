class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max=0;
        int min=Integer.MAX_VALUE;
        long res=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        for(int i=0;i<k;i++){
            res+=(max-min);
        }
        return res;
    }
}