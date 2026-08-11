class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int pre=nums[0];
        int i=1;
        while(i<nums.length){
            if(nums[i-1]+1==nums[i]) pre+=nums[i];
            else break;
            i++;
        }
        while(set.contains(pre)){
            pre++;
        }
        return pre;
    }
}