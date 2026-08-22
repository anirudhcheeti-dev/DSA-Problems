class Solution {
    public boolean checkDivisibility(int n) {
        int og=n;
        int digit=0;
        int product=1;
        while(n>0){
            digit+=n%10;
            product*=n%10;
            n=n/10;
        }
        return (og%(digit+product))==0;
    }
}