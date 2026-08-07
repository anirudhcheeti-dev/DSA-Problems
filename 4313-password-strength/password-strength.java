class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> set=new HashSet<>();
        int score=0;
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(!set.contains(ch)){
                if(ch>='a'&&ch<='z') score++;
                else if(ch>='A'&&ch<='Z') score=score+2;
                else if(Character.isDigit(ch)) score=score+3;
                else score=score+5;
                set.add(ch);
            }
        }
        return score;
    }
}