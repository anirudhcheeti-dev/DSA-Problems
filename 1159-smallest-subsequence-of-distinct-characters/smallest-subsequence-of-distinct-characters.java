class Solution {
    public String smallestSubsequence(String s) {
        int[] freq =new int[26];
        Deque<Character> st=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
        }
        boolean[] visit=new boolean[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a']--;
                if(visit[s.charAt(i)-'a']){
                    continue;
                }
                else if(st.isEmpty()||(st.peek()<s.charAt(i))){
                    st.push(s.charAt(i));
                    visit[s.charAt(i)-'a']=true;
                }else{
                    while(!st.isEmpty()&&st.peek()>s.charAt(i)&&freq[st.peek() - 'a']>0){
                        char popped = st.pop(); 
                        visit[popped - 'a'] = false;
                    }
                    st.push(s.charAt(i));
                    visit[s.charAt(i) - 'a'] = true;
                }
            }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}