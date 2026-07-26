class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        helper(0,nums,res,new ArrayList<>());
        return res;
    }
    private static void helper(int index, int[] nums, List<List<Integer>> res, List<Integer> curr) {
        if(index==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        helper(index+1,nums,res,curr);
        curr.remove(curr.size()-1);
        helper(index+1,nums,res,curr);
    }
}