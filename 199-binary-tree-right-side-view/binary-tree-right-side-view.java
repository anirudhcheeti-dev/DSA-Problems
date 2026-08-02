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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Deque<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int curr=q.size();
            for(int i=0;i<curr;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
                if(i==curr-1) list.add(temp.val);
            }
        }
        return list;
    }
}