class Solution {
    public int numIdenticalPairs(int[] nums) {
         int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.merge(i, 1, (x, y) -> (x + y));
            
        }
        for(int i:nums){
            if(!(map.get(i) <=1)){
                result+=map.get(i)-1;
                map.put(i,map.get(i)-1);
            }
        }
        return result;

            }
        }