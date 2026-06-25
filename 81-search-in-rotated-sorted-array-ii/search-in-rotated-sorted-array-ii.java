class Solution {
    public boolean search(int[] nums, int target) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        if(set.contains(target)) return true;
        else return false;
    }
}