class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        int cnt=0;
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0) continue;
            for(int j=0;j<digits.length;j++){
                if(i==j) continue;
                for(int k=0;k<digits.length;k++){
                    if(j!=k&&i!=k&&digits[k]%2==0){
                        int cur=100*digits[i]+10*digits[j]+digits[k];
                        if(!set.contains(cur)){
                            set.add(cur);
                            list.add(cur);
                            cnt++;
                        }
                    }
                }
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        Arrays.sort(res);
        return res;
    }
}