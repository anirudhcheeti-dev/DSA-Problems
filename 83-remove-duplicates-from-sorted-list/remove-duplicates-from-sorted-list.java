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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode curr=head;
        ListNode temp=dummy;
        while(curr!=null){
            if((curr.next!=null&&curr.val!=curr.next.val)||curr.next==null)
            {
                temp.next=curr;
                temp=temp.next;
            }
            curr=curr.next; 
        }
        //curr.next=null;
        temp.next=null;
        return dummy.next;
    }
}