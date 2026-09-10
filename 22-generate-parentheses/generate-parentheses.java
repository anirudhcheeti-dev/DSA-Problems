class Solution {
    public List<String> generateParenthesis(int n) {
        String s=new String();
        List<String> list=new ArrayList<>();
        helper(list,n,0,0,s);
        return list;
    }
    public void helper(List<String> res,int n,int open,int close,String curr){
        if(curr.length()==2*n){
            res.add(curr);
            return;
        }

        if(open<n){
            helper(res,n,open+1,close,curr+"(");
        }
        if(close<open){
            helper(res,n,open,close+1,curr+")");
        }
    }
}