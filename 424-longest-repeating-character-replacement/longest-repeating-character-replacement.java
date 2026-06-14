class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            max=Math.max(max,map.get(s.charAt(i)));
            int window=(i-left)+1;
            if((window-max)>k){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
        }
        return s.length()-left;
    }
}