class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();//Global List
        helper(0,nums,list,new ArrayList<>());
        return list;
    }
    public void helper(int st,int[] nums, List<List<Integer>> res , List<Integer> curr){

        res.add(new ArrayList<>(curr));
        //base case records every subset
        
        for(int i=st;i<nums.length;i++){
            curr.add(nums[i]);
            helper(i+1,nums,res,curr);//here when we do i+1 we dont actually change the for loop working but declare a new i
            curr.remove(curr.size()-1);
        }
    }//good quetion
}