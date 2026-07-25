class Solution {
    public int maxProduct(int n) {
        int max=0;
        int max1=0;

        int digit=0;
        while(n>0){
            digit=n%10;
            if(digit>max){
                max1=max;
                max=digit;
            }else if(digit>max1){
                max1=digit;
            }
            n=n/10;
        }
    return max*max1;
        // ArrayList<Integer> list=new ArrayList<>();
        // int max=1;
        // int i=0;
        // while(n>0){
        //     list.add(n%10);
        //     n=n/10;
        // }
        // Collections.sort(list);
        // if(list.size()>1) return list.get(list.size()-1)*list.get(list.size()-2);
        // return list.get(list.size()-1);
    }
}