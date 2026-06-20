class Solution {
    public int vowelConsonantScore(String s) {
        int n=s.length();
        int v=0;
        int c=0;
        
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                v++;
            }
            else if(ch>='a'&&ch<='z'){
                c++;
            }
        }
        int res=0;
            if(c!=0&&v!=0){
                res=v/c;
            }
        return res;
    }
}