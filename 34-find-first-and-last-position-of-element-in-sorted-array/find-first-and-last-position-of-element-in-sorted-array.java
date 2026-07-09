class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int res[]=new int[2];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                 int left = mid;
                while (check(nums, left - 1, target) != -1) {
                    left--;
                }
                int right = mid;
                while (check(nums, right + 1, target) != -1) {
                    right++;
                }
                res[0] = left;
                res[1] = right;
                return res;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    public int check(int[] nums,int mid,int target){
        if(mid>=0&&mid<nums.length&&nums[mid]==target){
            return mid;
        }
        return -1;
    }
}