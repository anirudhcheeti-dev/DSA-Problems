class Solution {
    public int reverseDegree(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            int val=('z'-s.charAt(i)+1)*(i+1);
            res+=val;
        }
        return res;
    }
}