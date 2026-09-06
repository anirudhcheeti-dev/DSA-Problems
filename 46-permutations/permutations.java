class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list=new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        helper(used,nums,list,new ArrayList<>());
        return list;

    }
    public void helper(boolean[] st,int[] nums,List<List<Integer>> res, List<Integer> curr){
        
        //base case when list.size==nums.length
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(st[i]==true) continue;
            //if we already visited then we skip it 

            curr.add(nums[i]);
            st[i]=true;
            // we add the current element and make true
            helper(st,nums,res,curr);

            curr.remove(curr.size()-1);
            st[i]=false;
            // when we add a curr to list we make it false to add a new subset.
        }
    }
}