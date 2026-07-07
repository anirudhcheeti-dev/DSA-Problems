class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        long sum=0;
        int mul=1;
        while(n>0){
            int digit=n%10;
            if(digit==0){
                n=n/10;
            }
            else{
            x=x+mul*digit;
            mul=mul*10;
            sum+=digit;
            n=n/10;
            }
        }
        return sum*x;
    }
}