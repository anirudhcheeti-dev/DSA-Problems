class Solution {
    public boolean asteroidsDestroyed(long mass, int[] ast) {
        Arrays.sort(ast);
        for(int i=0;i<ast.length;i++){
            if(mass>=ast[i]){
                mass+=ast[i];
            }
            else return false;
        }
        return true;
    }
}