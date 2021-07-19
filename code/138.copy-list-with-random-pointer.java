/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> hs = new HashMap<>();
        Node temp = head;
        while(temp!=null){
            hs.put(temp,new Node(temp.val));
            temp=temp.next;
        }
        temp = head;
        while(temp!=null){
            hs.get(temp).next = hs.get(temp.next);
            hs.get(temp).random = hs.get(temp.random);
            temp=temp.next;
        }
        return hs.get(head);
    }
}