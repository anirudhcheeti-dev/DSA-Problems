class Solution {
    public boolean isTrionic(int[] nums) {
        int p=0;
        int q=0;
        int i=0;
        while(i<nums.length-1&&nums[i]<nums[i+1]){
            i++;
        }
        if(i==nums.length-1||i==0) return false;
        p=i;
        while(i<nums.length-1&&nums[i]>nums[i+1]){
            i++;
        }
        if(i==nums.length-1||i==p) return false;
        q=i;
        while(i<nums.length-1 &&nums[i]<nums[i+1]){
            i++;
        }
        
        if(i==nums.length-1) return true;
        
        return false;
    }
}