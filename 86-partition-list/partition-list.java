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
    public ListNode partition(ListNode head, int x) {
        ListNode large =new ListNode(0);
        ListNode small=new ListNode(0);
        ListNode curr=small;
        ListNode curr2=large;
        
        while(head!=null){
            if(head.val<x){
                curr.next=head;
                head=head.next;
                curr=curr.next;
            }else{
                curr2.next=head;
                head=head.next;
                curr2=curr2.next;
            }
        }
        curr2.next=null;
        curr.next=large.next;
        return small.next;
    }
}