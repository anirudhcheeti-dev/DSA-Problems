class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        int max=nums.length/3;
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        //int max = 0;
        for(int i : map.keySet()){
            if(map.get(i)>max){
                
                res.add(i);
            }
        }
        return res;
    }
}