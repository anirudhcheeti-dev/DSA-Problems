class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int main=x;
        if(x<0) return false;
        while(x>0){
                int digit=x%10;
                sum=sum*10+digit;
                x=x/10;;
            }
        if(main==sum) return true;
        return false;
    }
}