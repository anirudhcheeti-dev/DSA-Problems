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
        ListNode prev=dummy;
        //ListNode 
        while(head!=null){
            if(head.next!=null&&head.val==head.next.val){
                int dup=head.val;
                while(head!=null&&dup==head.val){
                    head=head.next;
                }
            }
            else{
                prev.next=head;
                prev=prev.next;
                head=head.next;
            }
        }
        prev.next=null;
        return dummy.next;
    }
}