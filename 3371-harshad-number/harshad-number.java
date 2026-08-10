class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int n=x;
        int digit=0;
        while(n>0){
            digit+=n%10;
            n=n/10;
        }
        return x%digit==0 ? digit:-1;
    }
}