/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> order = new ArrayList<>();
        if(root == null) return order;
        postOrder(root, order);
        return order;
    }
    
    void postOrder(TreeNode root, ArrayList<Integer> order) {
        if(root == null) return;
        
        postOrder(root.left, order);
        postOrder(root.right, order);
        order.add(root.val);
    }
}