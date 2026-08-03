class Solution {
    public int findPeakElement(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int mid=(i+(j-i)/2);
            if(nums[mid]<nums[mid+1]) i=mid+1;
            else j=mid;
        }
        return i;
    }
}  
    //     int i=0;
    //     int j=nums.length-1;
    //     while(i<=j){
    //         int mid=(i+(j-i)/2);
    //         int c=check(mid,nums);
    //         if(c==mid) return mid;
    //         else if(c>mid) i=mid+1;
    //         else j=mid-1;
    //     }
    //     return 0;
    // }
    // public int check(int num,int[] nums){
    //     int n=nums.length;
    //     if(( num+1!=n && nums[num+1] < nums[num] ) && (num-1 >= 0 && nums[num-1] < nums[num])) return num;
    //     else if(num+1!=n && nums[num]<nums[num+1]) return num+1;
    //     else return num-1;
    // }
