import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lt=0;
        int Maxlen=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(lt));
                lt++;
            }
                set.add(s.charAt(i));
                Maxlen=Math.max(Maxlen,i-lt+1);
            
        }
        return Maxlen;
    }
}