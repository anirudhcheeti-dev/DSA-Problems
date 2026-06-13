class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sc=new StringBuilder();
        for(String w:words){
            int sum=0;
            for(char ch : w.toCharArray()){
                sum+=weights[ch-'a'];
            }
            //int f=sum%26;
            sc.append((char)('z'-(sum%26)));
        }
        return sc.toString();
    }
}