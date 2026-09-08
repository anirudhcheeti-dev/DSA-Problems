class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        helper(0,nums,list,new ArrayList<>());
        return list;
    }
    public void helper(int st,int[] nums,List<List<Integer>> res,List<Integer> curr){
        res.add(new ArrayList<>(curr));

        for(int i=st;i<nums.length;i++){
            if(i>st && nums[i]==nums[i-1]) continue;

            curr.add(nums[i]);
            helper(i+1,nums,res,curr);
            curr.remove(curr.size()-1);
        }
    }
}