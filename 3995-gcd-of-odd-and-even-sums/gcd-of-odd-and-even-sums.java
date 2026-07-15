class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd=0;
        int sumeven=0;
        n=n*2;
        while(n>=0){
            if(n%2==0){
                sumeven+=n;
            }else{
                sumodd+=n;
            }
            n--;
        }
        int gcd=0;
        for(int i=1;i<=sumeven&&i<=sumodd;i++){
            if(sumeven%i==0&&sumodd%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}