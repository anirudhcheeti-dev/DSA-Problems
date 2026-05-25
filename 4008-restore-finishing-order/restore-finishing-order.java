class Solution {
    public int[] recoverOrder(int[] o, int[] f) {

        HashSet<Integer> set=new HashSet<>();


        int[] res=new int[f.length];
        int ind=0;
        for(int i:f){
            set.add(i);
        }
        for(int i:o){
            if(set.contains(i)){
                res[ind++]=i;
                

            }
        }
        return res;

        }      
    }
