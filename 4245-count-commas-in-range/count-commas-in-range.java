class Solution {
    public int countCommas(int n) {
        if(n<=999) return 0;
        else if(n>999 && n<100000) return n-999;
        return 1+(n-1000);
    }
}