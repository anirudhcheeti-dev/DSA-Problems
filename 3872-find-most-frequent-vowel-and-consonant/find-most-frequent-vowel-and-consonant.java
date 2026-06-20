import java.util.HashMap;

class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int max=0;
        int sum=0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                if(map.containsKey(ch)){
                    max = Math.max(max,map.get(ch));
                }
            }else{
                sum=Math.max(sum,map.get(ch));
            }
        }
        return sum+max;
    }
}