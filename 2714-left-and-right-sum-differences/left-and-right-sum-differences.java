class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0]=0;
        int[] ans = new int[nums.length];

        right[nums.length-1]=0;
        int r=0;
        int a=0;

        for (int i = 0; i < nums.length - 1; i++) {
            r+=nums[i];
            left[i+1]=r;
        }
        for (int i = nums.length - 1; i > 0; i--) {
            a+=nums[i];
            right[i-1]=a;
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i]=Math.abs(left[i]-right[i]);
        }
        return ans;
    }
}