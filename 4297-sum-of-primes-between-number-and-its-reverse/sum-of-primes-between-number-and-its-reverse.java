class Solution {
    public int sumOfPrimesInRange(int n) {
        int x = 0;
        int temp=n;
        while (n != 0) {
            int t = n % 10;
            x = x * 10 + t;
            n = n / 10;
        }
        int min = Math.min(temp, x);
        int max = Math.max(temp, x);
        
        return sum(min, max);
    }
    public int sum(int n, int m) {
        int total = 0;
       for (int i = n; i <= m; i++) {
           if(isPrime(i)){
                total += i;
           }
        }
       return total;
    }
    public boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}