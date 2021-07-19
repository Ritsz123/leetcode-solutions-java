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
    public boolean isValidBST(TreeNode root) {
        if(root.left == null && root.right == null) return true;
        return isBst(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    boolean isBst(TreeNode root, long min, long max){
        if(root == null) return true;
        return min < root.val && root.val < max && isBst(root.left, min, root.val) && isBst(root.right, root.val, max);
    }
}