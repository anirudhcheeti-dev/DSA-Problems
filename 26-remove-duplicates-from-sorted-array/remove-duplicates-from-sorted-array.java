class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int left=1;
        for(int i=1;i<nums.length;i++){
            //nums[left]=nums[i];
            if(nums[i]!=nums[left-1]) {
                nums[left]=nums[i];
                left++;
        }
        }
        return left;
    }
}