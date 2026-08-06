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
    public int findBottomLeftValue(TreeNode root) {
        Deque<TreeNode> q=new LinkedList<>();
        if(root==null) return 0;
        q.offer(root);
        int left=root.val;
        while(!q.isEmpty()){
            int curr=q.size();
            for(int i=0;i<curr;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null)q.offer(temp.right);
                if(i==0){
                    left=temp.val;
                }
            }
        }
        return left;
    }
}