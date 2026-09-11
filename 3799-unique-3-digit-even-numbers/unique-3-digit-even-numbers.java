class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set=new HashSet<>();
        int cnt=0;
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(i!=j&&j!=k&&i!=k&&digits[i]!=0&&digits[k]%2==0){
                        int cur=100*digits[i]+10*digits[j]+digits[k];
                        if(!set.contains(cur)){
                            set.add(cur);
                            cnt++;
                        }
                    }
                }
            }
        }
        return cnt;
    }
}