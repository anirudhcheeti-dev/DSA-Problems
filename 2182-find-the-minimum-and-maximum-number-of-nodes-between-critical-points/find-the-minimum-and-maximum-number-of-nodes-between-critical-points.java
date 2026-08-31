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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode start=head;
        ListNode curr=head.next;
        
        int[] res=new int[2];
        int ind=1;

        int front=-1;
        int last=-1;
        int min=Integer.MAX_VALUE;
        while(curr.next!=null){
            if((start.val<curr.val && curr.val>curr.next.val)||(start.val>curr.val && curr.val<curr.next.val)){
                if(front==-1){
                    front=ind;
                }
                else {
                    min=Math.min(min,ind-last);
                }
                last=ind;
            }
            ind++;
            start=curr;
            curr=curr.next;
        }
        if(front==-1||front==last) return new int[]{-1,-1};
        return new int[]{min,last-front};
    }
}