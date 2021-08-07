/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();
            for(int i = 0;i<size;i++) {
                Node curr = q.remove();
                level.add(curr.val);
                
                for(Node x: curr.children){
                    q.add(x);
                }
            }
            ans.add(new ArrayList<>(level));
        }
        return ans;
    }
}