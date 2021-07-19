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
    public int getDecimalValue(ListNode head) {
        String str = "";
        while(head!=null){
            str+=head.val;
            head=head.next;
        }
        
        int num=0;
        for(int i=str.length()-1;i>=0;i--){
           num += Integer.parseInt(Character.toString(str.charAt(i))) * Math.pow(2,str.length()-1 - i);
        }
        return num;
    }
}