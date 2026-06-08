import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        //ArrayList<Integer> list3 = new ArrayList<>();
        int c=0;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i=0; i<nums.length; i++){
            if (nums[i] < pivot){
                list.add(nums[i]);
            }
            else if (nums[i] > pivot){
                list2.add(nums[i]);
            }
            else{
                c++;
            }
           
            
        }
        for (int i=0; i<list.size(); i++){
            res.add(list.get(i));
        }
        
        for(int i=0;i<c;i++){
            res.add(pivot);
        }
        for(int i=0;i<list2.size();i++){
            res.add(list2.get(i));
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}