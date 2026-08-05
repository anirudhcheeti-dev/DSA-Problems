class Solution {
    public int calculate(String S) {
        Deque<String> st=new ArrayDeque<>();
        String s=S.replaceAll("\\s+","");
        int i=0;
        while(i<s.length()){
            char c=s.charAt(i);
            if(c=='('){
                st.push("(");
            }
            else if(!st.isEmpty()&&c==')'){
                String a=st.pop();
                st.pop();
                if(!st.isEmpty()&&(st.peek().equals("-")||st.peek().equals("+")) ){
                    String b=st.pop();
                    Long a1=Long.parseLong(st.pop());
                    Long a2=Long.parseLong(a);
                    Long res=b.equals("+")?a1+a2:a1-a2;
                    st.push(String.valueOf(res));
                }
                else{
                    st.push(a);
                }
            }
            else if(c=='+'||c=='-'){
                if(st.isEmpty()||st.peek().equals("(")){
                    st.push("0");
                }
                st.push(String.valueOf(c));
            }
            else if (Character.isDigit(c)) {
                //this is to make sure u add multi digit numbers safely.current after pushing it reads by charcter.
                //using this inbuilt function life is easier
                StringBuilder numBuilder = new StringBuilder();
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    numBuilder.append(s.charAt(i));
                    i++;
                }
                i--;

                String numStr = numBuilder.toString();

                if(!st.isEmpty()&&st.peek().equals("(")){
                    st.push(numStr);
                }
                else if(!st.isEmpty()&&st.peek().equals("+")){
                    st.pop();
                    Long a=Long.parseLong(st.pop());
                    Long b=Long.parseLong(numStr);
                    st.push(String.valueOf(a+b));
                }else if(!st.isEmpty()&&(st.peek().equals("-"))) {
                    st.pop();
                    Long a=Long.parseLong(st.pop());
                    Long b=Long.parseLong(numStr);
                    st.push(String.valueOf(a-b));
                }
                else{
                    st.push(numStr);
                }
            }
            i++;
        }
       return (int)Long.parseLong(st.pop());
    }
}