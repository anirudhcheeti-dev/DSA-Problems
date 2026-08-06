class Solution {
    public int smallestNumber(int n, int t) {
        int i=n;
      while(i<n+10){
        if(check(i,t)){
            return i;
        }
        i++;
      }
      return -1;
    }
    public boolean check(int n,int t){
        int digit=1;
        while(n>0){
            digit*=n%10;
            n=n/10;
        }
        return (digit%t==0);
    }
}