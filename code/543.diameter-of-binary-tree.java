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
    int diam = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        length(root);
        return diam;
    }
    
    int length(TreeNode root){
        if(root == null) return 0;
        int left = length(root.left);
        int right = length(root.right);
        diam = Math.max(diam, left + right);
        return Math.max(left, right) + 1;
    }
}