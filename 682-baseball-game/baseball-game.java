class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> st=new ArrayDeque<>();
        int total=0;
        for(int i=0;i<operations.length;i++){
            String op=operations[i];
            if(op.equals("+")&&st.size()>=2){
                int x=st.pop();
                int y=st.peek();
                int sum=x+y;
                st.push(x);
                st.push(sum);
            }
            else if(op.equals("D")&&!st.isEmpty()){
                int x=st.peek()*2;
                st.push(x);
            }
            else if(op.equals("C")&&!st.isEmpty()){
                st.pop();
            }
            else{
                int res=Integer.parseInt(op);
                st.push(res);
            }
        }
        while(!st.isEmpty()){
            total+=st.pop();
        }
        return total;
    }
}