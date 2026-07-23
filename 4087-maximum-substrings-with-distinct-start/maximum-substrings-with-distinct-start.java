class Solution {
    public int maxDistinct(String s) {
        boolean[] ar=new boolean[26];
        int count=0;
        for(int i=0;i<s.length();i++){
            int ind=s.charAt(i)-'a';
            if(!ar[ind]){
                ar[ind]=true;
                count++;
            }
        }
        return count;

        // HashSet<Character> set=new HashSet<>();
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(set.contains(ch)) continue;
        //     else set.add(ch);
        // }
        // return set.size();

    }
}