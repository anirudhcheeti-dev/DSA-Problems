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
    public List<Integer> largestValues(TreeNode root) {
        Deque<TreeNode> q=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return list;
        q.offer(root);
        while(!q.isEmpty()){
            int curr=q.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<curr;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null)q.offer(temp.right);
                max=Math.max(max,temp.val);
            }
            list.add(max);
        }
        return list;
    }
}