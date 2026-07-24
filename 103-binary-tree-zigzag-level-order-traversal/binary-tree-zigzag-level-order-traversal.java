/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        if(root==null) return list;
        q.offer(root);
        int c=0;
        while(!q.isEmpty()){
            int curr=q.size();
            List<Integer> list1=new ArrayList<>();
            for(int i=0;i<curr;i++){
                TreeNode temp=q.poll();
                list1.add(temp.val);
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
            }
            if(c==0){
                list.add(list1);
                c=1;
            }else{
                Collections.reverse(list1);
                list.add(list1);
                c=0;
            }
        }
        return list;
    }
}