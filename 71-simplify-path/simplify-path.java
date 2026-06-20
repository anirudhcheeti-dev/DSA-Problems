import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String simplifyPath(String path) {
        String[] s=path.split("/+");
        Deque<String> stack = new ArrayDeque<>();
        for(String dir:s){
            if(dir.isEmpty()||dir.equals(".")){
                continue;
            }
            if(dir.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(dir);
            }
        }
        if(stack.isEmpty()){
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
             sb.append('/').append(stack.removeLast());
        }
        return sb.toString();
    }
}