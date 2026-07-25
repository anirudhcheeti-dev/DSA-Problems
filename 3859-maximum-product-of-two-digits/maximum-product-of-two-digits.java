class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        int max=1;
        int i=0;
        while(n>0){
            list.add(n%10);
            n=n/10;
        }
        Collections.sort(list);
        if(list.size()>1) return list.get(list.size()-1)*list.get(list.size()-2);
        return list.get(list.size()-1);
    }
}