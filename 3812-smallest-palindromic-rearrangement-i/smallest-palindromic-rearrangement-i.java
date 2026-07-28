class Solution {
    public String smallestPalindrome(String s) {
       ArrayList<Character> list = new ArrayList<>();
            for (int i = 0; i < s.length() / 2; i++) {
                list.add(s.charAt(i));
            }
            Collections.sort(list);
            ArrayList<Character> list2 = new ArrayList<>(list);
            Collections.reverse(list2);

            StringBuilder sb = new StringBuilder();

        for (char ch : list) {
            sb.append(ch);
        }
        if(s.length()%2!=0){
            sb.append(s.charAt(s.length()/2));
        }
        for(char ch : list2){
            sb.append(ch);
        }
        return sb.toString();
       
        // if(s.length()<=3) return s;
        // char[] arr=s.toCharArray();
        // int i=1;
        // int j=arr.length-2;
        // while(i<j){
        //     char ch=arr[i];
        //     if(ch<arr[i-1]){
        //         char temp=arr[i];
        //         arr[i]=arr[i-1];
        //         arr[i-1]=temp;
        //         char temp2=arr[j];
        //         arr[j]=arr[j+1];
        //         arr[j+1]=temp2;
        //     }
        //     i++;
        //     j--;
        // }
        // return new String(arr);
    }
}