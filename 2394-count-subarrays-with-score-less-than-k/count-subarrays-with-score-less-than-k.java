class Solution {
    public long countSubarrays(int[] nums, long k) {
        long count=0;
        long score=0;
        long total=1;
        int i=0;
        for(int j=0;j<nums.length;j++){
                score+=nums[j];
                while(score*(j-i+1)>=k){
                    score-=nums[i];
                    i++;
                }
                count+=(j-i+1);
            }
        return count;
    }
}