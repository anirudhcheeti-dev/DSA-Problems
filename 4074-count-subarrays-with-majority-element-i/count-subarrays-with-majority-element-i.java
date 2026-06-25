class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int j=i;
            int cnt=0;
            while(j<n){
                if(nums[j]==target) {
                    cnt++;
                }
                if(cnt>(j-i+1)/2) {
                count++;
                }
                j++;
            }
        }
        return count;
    }
}