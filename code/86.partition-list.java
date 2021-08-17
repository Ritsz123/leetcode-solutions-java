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
        if(head == null) return head;
        
        ListNode h1 = new ListNode(0);
        ListNode c1 = h1;
        ListNode h2 = new ListNode(0);
        ListNode c2 = h2;
        
        while(head != null) {
            if(head.val < x) {
                c1.next = new ListNode(head.val);
                c1 = c1.next;
            } else {
                c2.next = new ListNode(head.val);
                c2 = c2.next;
            }
            
            head = head.next;
        }
        c1.next = h2.next;
        return h1.next;
    }
}