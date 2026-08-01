class Solution {
    public int jump(int[] nums) {
        if(nums.length==1) return 0;
        int jump=0;
        int cur=0;
        int far=0;
        for(int i=0;i<nums.length;i++){
            far=Math.max(far,nums[i]+i);
            if(i==cur){
                jump++;
                cur=far;
            
            if(cur>=nums.length-1){
                break;
            }
        }
        }
        return jump;
        
        // int i=0;
        // int min=0;
        // while(i<nums.length){
        //     int max=0;
        //     int var=0;
        //     min++;
        //     for(int j=i;j<=nums[i];j++){
        //         if(nums[j]==Math.abs((nums[j]-nums.length-1))){
        //             min++;
        //             return min;
        //         }
        //         else{
        //             if(nums[j]>=max){
        //                 i=j;
        //             }
        //         }
        //     }
            
        // }
        // return min;
        //TLE O(N²)
    }
}