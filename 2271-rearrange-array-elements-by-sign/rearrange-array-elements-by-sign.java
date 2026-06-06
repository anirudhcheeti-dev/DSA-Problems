class Solution {
    public int[] rearrangeArray(int[] nums) {
         int[] res = new int[nums.length];
        int index = 0;
        int j=1;
        for(int i = 0; i < nums.length; i++){
            if(Integer.signum(nums[i]) == 1){
                res[index] = nums[i];
                index+=2;
            }else{
                res[j]=nums[i];
                j+=2;
            }
        }
        return res;
    }
}