class Solution {
    public int minOperations(int[] nums, int x) {
        int left=0;
        int sum=0;
        int cnt=-1;
        int total=0;
        for(int i:nums){
            total+=i;
        }
        int max=0;
        int target=total-x;
        if(target<0) return -1;
        if(target==0) return nums.length;

        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>target){
                sum-=nums[left];
                left++;
            }
            if(sum==target){
                cnt=Math.max(cnt,right-left+1);
            } 
        }
        return cnt==-1?-1:nums.length-cnt;
    }
}