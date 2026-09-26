class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        for(List<String> i:knowledge){
            map.put(i.get(0).toString(),i.get(1).toString());
        }
        int i=0;
        StringBuilder main= new StringBuilder();
        while(i<s.length()){
            StringBuilder sb= new StringBuilder();
            if(s.charAt(i)=='('){
                i++;
                while(i<s.length()&&s.charAt(i)!=')'){
                    sb.append(s.charAt(i));
                    i++;
                }
                i++;
                String curr=sb.toString();
                if(map.containsKey(curr)){
                    main.append(map.get(curr));
                }else main.append("?");
            }
            else{
                 main.append(s.charAt(i));
                 i++;
            }
        }
        return main.toString();
    }
}