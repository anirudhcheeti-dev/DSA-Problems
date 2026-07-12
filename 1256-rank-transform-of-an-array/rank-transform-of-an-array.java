class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] arr1=arr.clone();
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(arr1);
         int cur=1;
        for(int i:arr1){
            if(!map.containsKey(i)){
                map.put(i,cur++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}