import java.util.Arrays;

class Solution {
    public int minElement(int[] nums) {
            int ans=Integer.MAX_VALUE;;
            for(int i = 0; i < nums.length; i++){
                int res = 0;
                while(nums[i]>0){
                        res += nums[i]%10;
                        nums[i]/=10;
                }
            ans=Math.min(ans,res);
            }
            return ans;
    }
}