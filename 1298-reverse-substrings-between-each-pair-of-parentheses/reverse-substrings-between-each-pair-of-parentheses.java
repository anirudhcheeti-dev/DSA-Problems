class Solution {
    public String reverseParentheses(String s) {
        Stack<String> st=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(sb.toString());
                sb=new StringBuilder();
            }
            else if(ch==')'){
                sb.reverse();
                sb=new StringBuilder(st.pop()).append(sb);
            }
            else sb.append(ch);
        }
        return sb.toString();
    }
}