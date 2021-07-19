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
        if(head==null || k==0) return head;
        int n = 1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            n++;
        }
        //point last pointer to first
        temp.next=head;
        
        k = k%n;
        int c = k;
        while(c!=n){
            c++;
            temp=temp.next;
        }
        head=temp.next;
        //cut the link of node
        temp.next = null;
        return head;
    }
}