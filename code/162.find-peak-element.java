/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode temp =headA;
        ListNode t = headB;
        while(temp!=null){
            while(t!=null){
                if(t==temp){
                    return t;
                }
                t=t.next;
            }
            t=headB;
            temp=temp.next;
        }
        return null;
    }
}