/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix=new int[m][n];
        for(int i=0;i<m;i++){
            matrix[i]=new int[n];
            Arrays.fill(matrix[i],-1);
        }
        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;
        if(head==null) return matrix;
        while(head!=null){

            for(int i=left;i<=right;i++){
                if(head!=null){
                matrix[top][i]=head.val;
                head=head.next;
                }
            }
            top++;
            for(int i=top;i<=bottom;i++){
                if(head!=null){
                matrix[i][right]=head.val;
                head=head.next;
            }
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                     if(head!=null){
                    matrix[bottom][i]=head.val;
                    head=head.next;
                }
                }
            }
            bottom--;
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                      if(head!=null){
                    matrix[i][left]=head.val;
                    head=head.next;
                }
                }
            }
            left++;
        }
        return matrix;
    }
}