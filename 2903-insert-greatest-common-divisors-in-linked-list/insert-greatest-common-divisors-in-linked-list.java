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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy=head;
        if(dummy==null||dummy.next==null) return dummy;
        while(dummy!=null&&dummy.next!=null){
            ListNode curr=dummy.next;
            ListNode temp=new ListNode(gcd(dummy.val,dummy.next.val));
            dummy.next=temp;
            temp.next=curr;
            dummy=curr;
        }
        return head;
    }
    public int gcd(int a,int b){
        int gcd=1;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0&&b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}