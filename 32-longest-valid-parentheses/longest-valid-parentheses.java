class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1); 
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(i);
            } 
            else {
                st.pop();
                if (st.isEmpty()) {
                    st.push(i);
                } 
                else {
                    max = Math.max(max, i - st.peek());
                }
            }
        }
        return max;
    }
}

// class Solution {
//     public int longestValidParentheses(String s) {
//         Stack<Integer> st=new Stack<>();
//         int cnt=0;
//         int max=0;
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(!st.isEmpty()){
//                 if(ch=='('&&st.peek()==')') st.push(ch);
//                 else if((ch=='(' && st.peek()=='(')){
//                     while(!st.isEmpty()){
//                         st.pop();
//                     }
//                     st.push(ch);
//                 }
//                 else if(ch==')'&&st.peek()==')'){
//                     while(!st.isEmpty()){
//                         st.pop();
//                     }
//                 }
//                 else{
//                     st.push(ch);
//                     max=Math.max(max,st.size());
//                 }
//             }
//             else{
//                 if(ch=='(') st.push(ch);
//             }
//         }
//         return max;
//     }
// }