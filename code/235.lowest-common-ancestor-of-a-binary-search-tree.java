/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        return lca(root, p.val, q.val);
    }
    
    TreeNode lca(TreeNode root, int p, int q){
        if(root == null) return null;
        
        if(root.val == p || root.val == q) return root;
        
        TreeNode left = lca(root.left, p, q);
        TreeNode right = lca(root.right, p, q);
        
        if(left == null && right == null) return null;
        else if(left == null && right != null) return right;
        else if(left != null && right == null) return left;
        else return root;
    } 
}