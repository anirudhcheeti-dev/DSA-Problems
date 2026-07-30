class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        //if(nums.length==1) return 
        if(k<=1) return 0;
        int count=0;
        int total=1;
        int i=0;
        for(int j=0;j<nums.length;j++){
            total=total*nums[j];
            while(total>=k){
                total=total/nums[i];
                i++;
            }
            count+=j-i+1;
        }
        return count;
    }
}