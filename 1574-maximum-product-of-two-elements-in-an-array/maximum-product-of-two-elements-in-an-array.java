class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            while(j<n){
                int sum=(nums[i]-1)*(nums[j]-1);
                max=Math.max(max,sum);
                j++;
            }
        }
        return max;


        // Arrays.sort(nums);
        // return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}