class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        helper(1,n,k,list,curr);
        return list;
    }
    public void helper(int st,int n,int k,List<List<Integer>> res,List<Integer> curr){
        if(curr.size()==k&&n==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(curr.size()>k) return;
        if(n<0) return;
        for(int i=st;i<=9;i++){
            curr.add(i);
            helper(i+1,n-i,k,res,curr);
            curr.remove(curr.size()-1);
        }
    }
}