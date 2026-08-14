class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int j=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            while(map.get(s.charAt(i))>2){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)-1);
                j++;
            }
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}