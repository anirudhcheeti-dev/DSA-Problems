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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy =new ListNode(0);
        ListNode curr=dummy;
        dummy.next=head;
        //ListNode A=head;
        //ListNode B=head.next;
        while(curr!=null&&curr.next!=null&&curr.next.next!=null){
            ListNode A=curr.next;
            ListNode B=curr.next.next;
            curr.next=B;
            A.next=B.next;
            B.next=A;
            curr=A;
        }
        return dummy.next;
    }
}