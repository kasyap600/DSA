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
        if(head==null) return null;
        ListNode l1=new ListNode(-1);
        ListNode l2=new ListNode(-1);
        ListNode p1=l1,p2=l2;
        while(head!=null) {
            if(head.val<x){
                p1.next=head;
                p1=p1.next;
            }
            else{
                p2.next=head;
                p2=p2.next;
            }
            head=head.next;
        }
        p2.next=null;
        p1.next=l2.next;
        return l1.next;
        
    }
}