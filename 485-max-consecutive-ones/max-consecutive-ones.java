class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result=0;
        int max=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                result++;
                max=Math.max(max,result);
            }
            else{
                result=0;
            }
        }
        return max;
    }
}