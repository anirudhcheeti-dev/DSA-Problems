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
    public void reorderList(ListNode head) {
        ListNode prev=null;
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
       ListNode newnode=slow.next;
       slow.next=null;
       slow=newnode;

        while(slow!=null){
            ListNode temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }
        ListNode first=head;
        ListNode second=prev;

        while(second!=null){
            ListNode firsthalf=first.next;
            ListNode secondhalf=second.next;

            first.next=second;
            second.next=firsthalf;

            first=firsthalf;
            second=secondhalf;
        }
    }
}