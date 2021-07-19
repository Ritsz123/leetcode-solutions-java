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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode curr = head, prev = null;
        while(left > 1){
            prev = curr;
            curr = curr.next;
            left--;
            right--;
        }
        
        ListNode conn = prev;
        ListNode tail = curr; // curr will be the last after reverse
        
        while(right > 0){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            right--;
        }
        if(conn != null){
           conn.next = prev; //left of reversed list
        }else{
            head = prev;
        }
        tail.next = curr; //
        return head;
        
    }
}