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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        for(int i = 1;i<lists.length;i++){
            ListNode dummy = new ListNode(-1);
            ListNode prev = null;

            ListNode l1 = lists[i-1];
            ListNode l2 = lists[i];
            if(l1 == null){
                dummy.next = l2;
                
            }else if(l2 == null){
                dummy.next = l1;
               
            }else{
                while(l1 != null && l2 != null){
                    if(l1.val <= l2.val){
                        if(prev == null){
                            dummy.next = l1;
                            prev = l1;
                        }else{
                            prev.next = l1;
                            prev = prev.next;
                        }

                        l1 = l1.next;

                    } else {
                        if(prev == null){
                            dummy.next = l2;
                            prev = l2;
                        }else{
                            prev.next = l2;
                            prev = prev.next;
                        }
                        l2 = l2.next;
                    }

                }
                if(l1 == null && l2 != null){
                    prev.next = l2;
                }
                if(l2 == null && l1 != null){
                    prev.next = l1;
                }
            }
            lists[i] = dummy.next;
        }
        return lists[lists.length-1];
    }
}