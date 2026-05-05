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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        int cnt=1;
        ListNode tail=head;
        while(tail.next != null){
            cnt++;
            tail=tail.next;
        }
        if(k%cnt==0) return head;
        k=k%cnt;
        tail.next=head;
        int end=cnt-k;
        while(end-->0){
            tail=tail.next;
        }
        head=tail.next;
        tail.next=null;
        return head;
    }
}