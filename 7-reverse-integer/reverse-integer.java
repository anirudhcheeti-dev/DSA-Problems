class Solution {
    public int reverse(int x) {
        int digit=0;
        long main=0;
        while(x!=0){
            digit=x%10;
            main=main*10+digit;
            x=x/10;
        }
        if (main > Integer.MAX_VALUE || main < Integer.MIN_VALUE) {
            return 0;
        }
       return (int)main;
    }
}