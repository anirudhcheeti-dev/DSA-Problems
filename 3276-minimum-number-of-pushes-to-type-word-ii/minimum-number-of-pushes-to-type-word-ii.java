class Solution {
    public int minimumPushes(String word) {
        int[] freq=new int[26];
        for(char ch:word.toCharArray()){
            freq[ch-'a']++;
        }
        Arrays.sort(freq);
        int min=0;
        int push=0;
        for(int i=25;i>=0;i--){
            int curr=25-i;
            if(curr%8==0) push++;
            min+=freq[i]*push;
        }
        return min;
    }
}