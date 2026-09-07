class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list =new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        helper(0,0,candidates,target,list,curr);
        return list;
    }
    public void helper(int st,int sum,int[] nums,int k,List<List<Integer>> res,List<Integer> curr){
        if(sum==k){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(sum>k) return;
        for(int i=st;i<nums.length;i++){
            sum+=nums[i];
            curr.add(nums[i]);
            helper(i,sum,nums,k,res,curr);
            sum-=curr.get(curr.size()-1);
            curr.remove(curr.size()-1);
        }
    }
}