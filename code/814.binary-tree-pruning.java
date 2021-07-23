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
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) return null;
        return prune(root);
    }
    
    TreeNode prune(TreeNode root) {
        
        if(root == null) return null;
        root.left = prune(root.left);
        root.right = prune(root.right);

        
        if(root.val == 0 && root.left == null && root.right == null){
            return null;
        }
        
        
        
        return root;
    }
}