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
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        return helper(nums,0,n-1);
    }
    public TreeNode helper(int[] nums,int start,int end){
        if(start>end) return null;
        int mid=start+(end-start)/2;
        TreeNode curr=new TreeNode(nums[mid]);//used to insert value to a treen
        curr.left=helper(nums,start,mid-1);//calls left subtree
        curr.right=helper(nums,mid+1,end);//calls rights subtree
        return curr;
    }
}