class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0;
        int j=nums.length-1;

        while(i<=j){
            int mid=(i+(j-i)/2);
            if(nums.length==1) return nums[mid];

            int c=check(mid,nums);
            if(c==-1) return nums[mid];
            else if(c<mid){
                if((c-i+1)%2==0){
                    j=c-1;
                }else{
                    i=mid+1;
                }
            }
            else{
                if((j-c+1)%2==0){
                    i=c+1;
                }else{
                    j=mid-1;
                }
                }
            }
            return 0;
        }
    public int check(int num,int[] nums){
        if(num+1!=nums.length&&nums[num+1]==nums[num]) return num+1;
        else if(num-1>=0&&nums[num-1]==nums[num]) return num-1;
        else return -1;
    }
}
