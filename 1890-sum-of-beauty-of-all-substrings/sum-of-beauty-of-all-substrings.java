class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++) {
            int j=i;
            int[] freq=new int[26];
            int max=0;
            while(j<n){
                freq[s.charAt(j) - 'a']++;
                max=Math.max(max,freq[s.charAt(j) - 'a']);
                int min=Integer.MAX_VALUE;
                for(int k:freq){
                    if(k!=0) {
                        min = Math.min(min, k);
                    }
                }
                sum=max-min;
                if(sum!=0){
                    count+=sum;
                }
                j++;
            }
        }
        return count;
    }
}
