class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> set=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int res=target-nums[i];
            if(set.containsKey(res)){
                return new int[]{set.get(res),i};
            }
            else{
                set.put(nums[i],i);
            }
        }
        return new int[]{0,0};
    }
}