class Solution {
    public int myAtoi(String s) {
        String S=s.stripLeading();
      if(S.length()==0) return 0;
      int i=0;
      int n=S.length();
           int sign=1;
           if(S.charAt(0)=='-'){
               sign=-1;
               i++;
           }
           else if(S.charAt(0)=='+'){
               sign=1;
               i++;
           }
           long res=0;
           while(i<n&&Character.isDigit(S.charAt(i))){
               res=res*10+(S.charAt(i)-'0');
               if(res*sign>Integer.MAX_VALUE) return Integer.MAX_VALUE;
               if(res*sign<Integer.MIN_VALUE) return Integer.MIN_VALUE;
               i++;
           }
        return (int) (res*sign);
    }
}