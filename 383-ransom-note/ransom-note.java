class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // String[] ran=ransomNote.toCharArray();
        // String[] mag=ransomNote.toCharArray();
        int[] freq=new int[26];
        for(char ch:magazine.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:ransomNote.toCharArray()){
            if(--freq[ch-'a']<0)return false;
        }
        return true;
        // if(magazine.contains(ransomNote)) return true;
        // return false;
    }
}