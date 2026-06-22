class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map=new HashMap<>();
        //int count=0;
        for(char ch : text.toCharArray()){
            if(ch=='b'||ch=='a'||ch=='l'||ch=='o'||ch=='n'){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        int c1=map.getOrDefault('b',0);
        int c2=map.getOrDefault('a',0);
        int c3=map.getOrDefault('l',0)/2;
        int c4=map.getOrDefault('o',0)/2;
        int c5=map.getOrDefault('n',0);

        //if(c3==c4&&c1==c2&&c2==c5&&){
            return Math.min(c1,Math.min(c2,Math.min(c3,Math.min(c4,c5))));
        //}
    
    }
}