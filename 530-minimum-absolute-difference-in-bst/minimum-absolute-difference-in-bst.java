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
    int min=Integer.MAX_VALUE;
    Integer pre=null;
    public int getMinimumDifference(TreeNode root) {
        check(root);
        return min;
    }
    public void check(TreeNode root){
        if(root==null) return;
        check(root.left);
        if(pre!=null){
            min=Math.min(min,root.val-pre);
        }
        pre=root.val;
        check(root.right);
    }
}