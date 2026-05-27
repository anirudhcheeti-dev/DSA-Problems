class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans = new int[nums.length*2];
        int[] reverse = new int[nums.length];
        int j = 0;
        for (int i = nums.length-1; i >=0; i--) {
            reverse[j++] = nums[i];
        }
        int n = nums.length;
        for(int i=0;i<nums.length;i++) {
            ans[i] = nums[i];
            ans[i+n] = reverse[i];
            
        }
        return ans;
    }
}