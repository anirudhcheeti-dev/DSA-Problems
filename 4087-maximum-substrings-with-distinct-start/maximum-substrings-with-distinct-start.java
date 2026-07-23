class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(set.contains(ch)) continue;
            else set.add(ch);
        }
        return set.size();
    }
}