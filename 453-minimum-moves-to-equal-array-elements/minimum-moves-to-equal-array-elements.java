class Solution {
    public int minMoves(int[] nums) {
        long sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            sum+=nums[i];
        }
        
        return (int) (sum-(min)*nums.length);
    }
}