class Solution {
    public String decodeString(String s) {
        int n=s.length();

        Stack<Integer> num=new Stack<>();//to push numbers
        Stack<String> str=new Stack<>();//to push letters and symbols
        StringBuilder sbr=new StringBuilder();//global string to append
        int val=0;//for numbers which are 2 digit

        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();//local for appending same symbols.
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                val = val * 10 + (s.charAt(i) - '0');//numbers which are 2 digit
            }
            else if(ch=='['){ 
                num.push(val);//push the two digit number
                val=0;//reset back to 0
                str.push("[");
            }
            else if(ch==']'){
                int nums=num.pop();//pop the number corresponding to the string
                StringBuilder curr=new StringBuilder();//used for only this bracket where u want to add string coreesponding to the number
                while(!str.isEmpty() && !str.peek().equals("[")){//check if top not equal to "["
                    curr.insert(0, str.pop());// a new syntax which adds elements from the front
                }
                str.pop();// pop the "["

                String temp = curr.toString();//to append same string 
                for(int j=0;j<nums;j++){
                    sb.append(temp);// append same string such as 'b' 3times
                }
                str.push(sb.toString());//push it back to stack to append for other values
                
            }else{
                if(!str.isEmpty()&&!str.peek().equals("[")){//if the peek is a character we have to then add the character in the same order like bc instead of cb sooo
                    sb.append(str.pop());//pop the current string
                    sb.append(s.charAt(i));// add the new char
                    str.push(sb.toString());//push entire to the stack
                }
                else str.push(ch+"");//if new then push
            }
        }
        while(!str.isEmpty()){
            sbr.insert(0,str.pop());//due to lifo we dont want it to come in reverse order so using the new syntax
        }
        return sbr.toString();
    }
}