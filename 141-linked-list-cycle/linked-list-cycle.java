/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode dummy1=head;
        ListNode dummy2=head;
        while(dummy1!=null){
            if(dummy2.next==null || dummy2.next.next==null){
                return false;
            }
            else {
            dummy1=dummy1.next;
            dummy2=dummy2.next.next;
            if(dummy1==dummy2) break;
            }
        }
        return true;
    }
}