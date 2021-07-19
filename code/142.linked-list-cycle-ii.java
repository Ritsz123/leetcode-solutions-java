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
    public ListNode detectCycle(ListNode head) {
        
        HashSet<ListNode> hs = new HashSet<>();
        while(head!=null){
            if(!hs.contains(head)){
                hs.add(head);
                head=head.next;
            }else{
                return head;
            }
        }
        return null;
    }
}