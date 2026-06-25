class Solution {
    public boolean search(int[] nums, int target) {
       int i=0;
       int j=nums.length-1;
       while(i<=j){
        int mid=i+(j-i)/2;
        if(nums[mid]==target){
            return true;
        }
        else if(nums[i]==nums[j]&&nums[i]!=target){
            i++;
            j--;
        }
        else if(nums[i]<=nums[mid]){
            if(nums[i]<=target&&nums[mid]>target){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        else if(nums[mid]<=nums[j]){
            if(nums[j]>=target&&nums[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
       }
       return false;
    }
}