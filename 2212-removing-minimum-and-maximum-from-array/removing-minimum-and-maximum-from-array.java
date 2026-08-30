class Solution {
    public int minimumDeletions(int[] nums) {
    int n=nums.length;
    int maxind=0;
    int minind=0;
    for(int i=0;i<n;i++){
        if(nums[i]>nums[maxind]) maxind=i;
        if(nums[i]<nums[minind]) minind=i;
    } 
    int front =0;
    int back=0;
    int both=0;
    if(maxind<=minind){ 
        front=minind+1;
        back=n-maxind;
        both=(maxind+1)+(n-minind);
    }
    else{
        front=maxind+1;
        back=n-minind;
        both=(minind+1)+(n-maxind);
    }
    return Math.min(front,Math.min(back,both));
    }
}