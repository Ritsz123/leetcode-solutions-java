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
    public boolean isCompleteTree(TreeNode root) {
        if(root == null) return true;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        boolean nullFound = false;
        while(!q.isEmpty()) {
            TreeNode curr = q.remove();
            if(curr == null) {
                nullFound = true;
            } else {
                if(nullFound) return false;
                q.add(curr.left);
                q.add(curr.right);
            }
        }
        return true;
    }
}