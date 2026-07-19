class Solution {
    public String smallestSubsequence(String s) {
        int[] freq =new int[26];
        Deque<Character> st=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
        }
        boolean[] visit=new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch - 'a']--;
                if(visit[ch-'a']){
                    continue;
                }
                else if(st.isEmpty()||(st.peek()<ch)){
                    st.push(ch);
                    visit[ch-'a']=true;
                }else{
                    while(!st.isEmpty()&&st.peek()>ch &&freq[st.peek() - 'a']>0){
                        char popped = st.pop(); 
                        visit[popped - 'a'] = false;
                    }
                    st.push(ch);
                    visit[ch- 'a'] = true;
                }
            }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}