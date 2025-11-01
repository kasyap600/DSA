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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int n=nums.length;
        ListNode temp=head;
        HashSet<Integer> map=new HashSet<>();
        for(int num:nums){
            map.add(num);
        }
        while(head!=null && map.contains(head.val)) head=head.next;
        while(temp!=null && temp.next!=null){
            while(temp.next!=null && map.contains(temp.next.val)){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
        return head;
    }
}