class Solution {
    public int strStr(String haystack, String needle) {
        int hay=haystack.length();
        int need=needle.length();
        int i=0;
        int j=0;
        int count=0;
        while(i<hay){
            char ch=haystack.charAt(i);
            if(ch==needle.charAt(j)){
                count++;
                j++;
            if(count==need) return i-need+1;
            }
            else{
                i=i-count;
                j=0;
                count=0;
            }
            i++;
        }
        return -1;
    }
}