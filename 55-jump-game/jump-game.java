class Solution {
    public boolean canJump(int[] nums) {
        int g=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]+i>=g){
                g=i;
            }
        }
        if(g!=0) return false;
        return true;
    }
}