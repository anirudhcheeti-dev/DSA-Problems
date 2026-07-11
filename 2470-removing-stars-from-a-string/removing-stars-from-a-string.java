class Solution {
    public String removeStars(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        Deque<Character> st=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(!st.isEmpty()&&s.charAt(i)=='*'){
                st.pop();
            }
            else if(s.charAt(i)=='*'){
                continue;
            }
            else{
                st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}